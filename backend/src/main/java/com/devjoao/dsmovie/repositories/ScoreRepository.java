package com.devjoao.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjoao.dsmovie.entities.Score;
import com.devjoao.dsmovie.entities.ScorePK;

//acessar filme no banco do dados
public interface ScoreRepository extends JpaRepository<Score, ScorePK>  {

	
}
