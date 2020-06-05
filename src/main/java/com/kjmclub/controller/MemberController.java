package com.kjmclub.controller;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.dao.impl.MemberDAOImpl;
import com.kjmclub.entity.Member;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> findAll(){
        return memberService.findAll();
    }
}
