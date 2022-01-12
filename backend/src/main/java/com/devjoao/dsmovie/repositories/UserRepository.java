package com.devjoao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjoao.dsmovie.entities.User;

//acessar filme no banco do dados
public interface UserRepository extends JpaRepository<User, Long>  {

	//busca por email
	User findByEmail(String email);	
}
