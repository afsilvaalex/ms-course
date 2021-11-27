package com.afsilva.mscourse.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afsilva.mscourse.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	

}
