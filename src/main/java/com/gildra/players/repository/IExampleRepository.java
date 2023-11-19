package com.gildra.players.repository;

import com.gildra.players.model.PlayersExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExampleRepository extends JpaRepository<PlayersExample, Long> {

}
