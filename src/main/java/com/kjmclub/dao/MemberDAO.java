package com.kjmclub.dao;

import com.kjmclub.entity.Member;
import com.kjmclub.entity.MemberDetails;

import java.util.List;

public interface MemberDAO {
    List<Member> findAll();
    List<MemberDetails> findAllMemberDetails();

    Member findMemberById(Long memberId);

    void deleteMemberById(Long memberId);
}
