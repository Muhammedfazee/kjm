package com.kjmclub.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER_DETAILS")
public class MemberDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMBER_DETAILS_ID")
    private long memberDetailsId;

    @Column(name = "PHONE")
    private long phone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    public long getMemberDetailsId() {
        return memberDetailsId;
    }

    public void setMemberDetailsId(long memberDetailsId) {
        this.memberDetailsId = memberDetailsId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
