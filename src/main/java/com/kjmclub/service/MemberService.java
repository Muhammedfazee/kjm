package com.kjmclub.service;

import com.kjmclub.entity.Member;
import com.kjmclub.entity.MemberDetails;

import java.util.List;

public interface MemberService {
    List<Member> findAll();

    List<MemberDetails> findAllMemberDetails();

    Member findMemberById(Long memberId);

    void deleteMemberById(Long memberId);
}
