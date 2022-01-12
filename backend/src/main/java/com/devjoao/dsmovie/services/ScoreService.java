package com.devjoao.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devjoao.dsmovie.dto.MovieDTO;
import com.devjoao.dsmovie.dto.ScoreDTO;
import com.devjoao.dsmovie.entities.Movie;
import com.devjoao.dsmovie.entities.Score;
import com.devjoao.dsmovie.entities.User;
import com.devjoao.dsmovie.repositories.MovieRepository;
import com.devjoao.dsmovie.repositories.ScoreRepository;
import com.devjoao.dsmovie.repositories.UserRepository;

@Service // componenete do sistema
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepositoy;

	@Autowired
	private ScoreRepository scoreRepositoy;

	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {

		User user = userRepositoy.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepositoy.saveAndFlush(user);
		}
		Movie movie = movieRepository.findById(dto.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());

		score = scoreRepositoy.saveAndFlush(score);

		// Percorrendo a listinhas e aculumulando os valores no sum
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		//Logica
		double avg = sum / movie.getScores().size();

		movie.setScore(avg);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.save(movie);

		return new MovieDTO(movie);
	}
}