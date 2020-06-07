package com.kjmclub.repository;

import com.kjmclub.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MemberDAO {
    public List<Member> listMembers();
}
