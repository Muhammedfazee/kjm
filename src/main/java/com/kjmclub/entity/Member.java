package com.kjmclub.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DOB")
    private Time dob;

    @OneToOne(mappedBy = "member")
    private MemberDetails memberDetails;

    @OneToMany(mappedBy = "member")
    private List<Address> addressList;

    @ManyToMany
    @JoinTable(
            name = "MEMBER_ACTIVITY",
            joinColumns = @JoinColumn(name = "MEMBER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ACTIVITY_ID")
    )
    private List<Activity> activityList;

    public Member() {
    }

    public Member(String firstName, String lastName, Time dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Time getDob() {
        return dob;
    }

    public void setDob(Time dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
