package com.kjmclub.controller;

import com.kjmclub.entity.Member;
import com.kjmclub.entity.MemberDetails;
import com.kjmclub.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public ResponseEntity<List<Member>> findAll(){
        List<Member> members = memberService.findAll();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @GetMapping(value = "/{memberId}")
    public ResponseEntity<Member> findMemberById(@PathVariable Long memberId){
        Member member = memberService.findMemberById(memberId);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{memberId}")
    public ResponseEntity<Member> deleteMemberById(@PathVariable Long memberId){
         memberService.deleteMemberById(memberId);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @GetMapping(value = "/memberDetails")
    public ResponseEntity<List<MemberDetails>> findAllMemberDetails(){
        List<MemberDetails> memberDetails = memberService.findAllMemberDetails();
        return new ResponseEntity<>(memberDetails, HttpStatus.OK);
    }
}
