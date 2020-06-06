package com.kjmclub.service.impl;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.entity.Member;
import com.kjmclub.entity.MemberDetails;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class memberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<Member> findAll() {
        return memberDAO.findAll();
    }

    @Override
    public List<MemberDetails> findAllMemberDetails() {
        return memberDAO.findAllMemberDetails();
    }

    @Override
    public Member findMemberById(Long memberId) {
        return memberDAO.findMemberById(memberId);
    }

    @Override
    public void deleteMemberById(Long memberId) {
        memberDAO.deleteMemberById(memberId);
    }


}
