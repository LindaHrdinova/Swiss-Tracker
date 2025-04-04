package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Division;
import com.github.LindaHrdinova.Swiss_Tracker.repository.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionService(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    public List<Division> getAll() {
        return (List<Division>) divisionRepository.findAll();
    }
}
