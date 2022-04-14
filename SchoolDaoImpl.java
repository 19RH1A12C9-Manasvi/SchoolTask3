package com.spring.dao;

import com.spring.entities.School;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SchoolDaoImpl implements SchoolDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(School school) {
        sessionFactory.getCurrentSession().save(school);
    }
    public void delete(School school) {
        sessionFactory.getCurrentSession().delete(school);
    }
    public void update(School school) {
        sessionFactory.getCurrentSession().update(school);
    }
    @SuppressWarnings("unchecked")
    public List<School> selects(){
		List<School> listUser = (List<School>) sessionFactory.getCurrentSession()
                .createCriteria(School.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return listUser; //criteria.list();
	}
}
