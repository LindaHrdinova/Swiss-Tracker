package com.github.LindaHrdinova.Swiss_Tracker.repository;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Division;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {
}
