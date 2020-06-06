package com.kjmclub.dao.impl;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.entity.Member;
import com.kjmclub.entity.MemberDetails;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
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
        Query<Member> query =
                session.createQuery("from MEMBER", Member.class);

        List<Member> members = query.getResultList();
        System.out.println("List"+ members);
        return members;
    }

    @Override
    public List<MemberDetails> findAllMemberDetails() {
        Session session = entityManager.unwrap(Session.class);

        Query<MemberDetails> query =
                session.createQuery("from MEMBER_DETAIL", MemberDetails.class);

        List<MemberDetails> memberDetails = query.getResultList();
        System.out.println("List"+ memberDetails);
        return memberDetails;
    }


    public Member findMemberById(Long memberId){
        Session session = entityManager.unwrap(Session.class);

        Query<Member> query =
                session.createQuery("from MEMBER M where M.memberId = :memberId ", Member.class);
        query.setParameter("memberId",memberId);
        List<Member> members = query.getResultList();
        System.out.println("List"+ members);
        if(!members.isEmpty()){
            return members.get(0);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteMemberById(Long memberId) {
        Session session = entityManager.unwrap(Session.class);
        Member member = findMemberById(memberId);
        session.delete(member);
    }
}
