package com.kjmclub.service.impl;

import com.kjmclub.entity.Member;
import com.kjmclub.repository.MemberDAO;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;
    @Override
    public List<Member> listMembers() {
        memberDAO.listMembers();
        return null;
    }
}
