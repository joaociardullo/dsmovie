package com.devjoao.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devjoao.dsmovie.dto.MovieDTO;
import com.devjoao.dsmovie.entities.Movie;
import com.devjoao.dsmovie.repositories.MovieRepository;

@Service // componenete do sistema
public class MovieService {

	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {// fazer a paginação pagable
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {// fazer a paginação pagable
		Movie result = repository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}