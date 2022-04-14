package com.spring.dao;

import com.spring.entities.School;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDao {

        void add(School school);
        void delete(School school);
        void update(School school);
        List<School> selects();
}

