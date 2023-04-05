package com.BerBG.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BerBG.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
