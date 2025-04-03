package com.github.LindaHrdinova.Swiss_Tracker.repository;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
}
