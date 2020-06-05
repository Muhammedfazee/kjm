package com.kjmclub.dao.impl;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.entity.Member;
import org.hibernate.Session;
import org.hibernate.query.Query;
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
    public MemberDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Member> findAll() {
        Session session = entityManager.unwrap(Session.class);

        Member member = new Member("Fazi","Mohd",new Time(System.currentTimeMillis()));
        session.saveOrUpdate(member);
        Query<Member> query =
                session.createQuery("from MEMBER", Member.class);

        List<Member> members = query.getResultList();
        System.out.println("List"+ members);
        return null;
    }
}
