package com.spring.services;

import java.util.List;

import com.spring.entities.School;


public interface SchoolService {

    void add(School school);
    void delete(School school);
    void update(School school);
    List<School> selects();

}