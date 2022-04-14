package com.spring.services;

import com.spring.dao.SchoolDao;
import com.spring.entities.School;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    public SchoolDao schoolDao;

    @Transactional
    public void add(School school) {
        schoolDao.add(school);
    }
    @Transactional
    public void delete(School school) {
        schoolDao.delete(school);
    }
    @Transactional
    public void update(School school) {
        schoolDao.update(school);
    }
    @Transactional
	public List<School> selects(){
		return schoolDao.selects();
    }
}
