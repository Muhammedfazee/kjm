package com.kjmclub.dao;

import com.kjmclub.entity.Member;
import java.util.List;

public interface MemberDAO {
    List<Member> findAll();
}
