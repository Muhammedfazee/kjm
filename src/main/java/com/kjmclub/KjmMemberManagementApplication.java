package com.kjmclub;

import com.kjmclub.dao.MemberDAO;
import com.kjmclub.dao.impl.MemberDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KjmMemberManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(KjmMemberManagementApplication.class, args);
	}

}
