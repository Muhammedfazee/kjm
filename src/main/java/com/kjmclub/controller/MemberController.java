package com.kjmclub.controller;

import com.kjmclub.entity.Member;
import com.kjmclub.repository.MemberDAO;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public ResponseEntity<List<Member>> listMembers(){
        System.out.println("inside listmembers");
        memberService.listMembers();
        return null;
    }
}
