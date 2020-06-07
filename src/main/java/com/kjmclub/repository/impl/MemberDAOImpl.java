package com.kjmclub.repository.impl;

import com.kjmclub.entity.Member;
import com.kjmclub.repository.MemberDAO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.sql.Time;
import java.util.List;


@Repository
public class MemberDAOImpl implements MemberDAO {


    private EntityManager entityManager;

    @Autowired
    public MemberDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    //@Transactional
    public List<Member> listMembers() {
        Session session = entityManager.unwrap(Session.class);

//        Member member = new Member("Fazil", "Mohd", new Time(System.currentTimeMillis()));
//        session.save(member);
//
//        Member member2 = new Member("Alan", "Kurian", new Time(System.currentTimeMillis()));
//        session.save(member2);

        List<Member> members =  session.createQuery("from Member", Member.class).getResultList();
        System.out.println(members);
        return null;
    }
}
