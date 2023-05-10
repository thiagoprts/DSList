package com.thiagoprates.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoprates.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
