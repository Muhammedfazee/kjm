package com.kjmclub.service.impl;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.entity.Member;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
}
