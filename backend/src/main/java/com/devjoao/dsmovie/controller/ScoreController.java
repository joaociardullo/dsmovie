package com.devjoao.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjoao.dsmovie.dto.MovieDTO;
import com.devjoao.dsmovie.dto.ScoreDTO;
import com.devjoao.dsmovie.services.ScoreService;

//End Point 
@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;

	@PutMapping
	public MovieDTO findById(@RequestBody ScoreDTO dto) { // compo da requisição
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}

}
