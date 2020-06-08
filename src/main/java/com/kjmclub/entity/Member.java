package com.kjmclub.entity;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.sql.Time;
import java.util.List;

@Entity(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMBER_ID")
    private Long memberId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DOB")
    private Time  dob;

    @OneToOne(mappedBy = "member",cascade = CascadeType.REMOVE)
    @Basic(fetch=FetchType.LAZY)
    private MemberDetails memberDetails;

    @OneToMany(mappedBy = "member",cascade = CascadeType.REMOVE)
    @Basic(fetch = FetchType.LAZY)
    private List<Address> addresses;

    @ManyToMany
    @JoinTable(
            name = "MEMBER_ACTIVITY",
            joinColumns = @JoinColumn(name = "MEMBER_ID"),
            inverseJoinColumns = @JoinColumn(name  = "ACTIVITY_ID")
    )
    private List<Activity> activities;

    public Member() {
    }

    public Member(String firstName, String lastName, Time dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
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

    public MemberDetails getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetails memberDetails) {
        this.memberDetails = memberDetails;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
