package com.devjoao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjoao.dsmovie.entities.Movie;

//acessar filme no banco do dados
public interface MovieRepository extends JpaRepository<Movie, Long>  {

	
}
