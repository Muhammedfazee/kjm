package com.kjmclub.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "MEMBER_DETAIL")
public class MemberDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMEBR_DETAIL_ID")
    private Long memberDetailsId;
    private Long phone;
    private String email;
    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    public Long getMemberDetailsId() {
        return memberDetailsId;
    }

    public void setMemberDetailsId(Long memberDetailsId) {
        this.memberDetailsId = memberDetailsId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
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

}
