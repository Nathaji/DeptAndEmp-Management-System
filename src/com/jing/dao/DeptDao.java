package com.jing.dao;

import java.util.List;
import com.jing.domain.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class DeptDao extends HibernateDaoSupport implements IDeptDao{

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Object findById(Integer id) {
		return (Department)getHibernateTemplate().get(Department.class, id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List<Object> findByAll() {
		return getHibernateTemplate().find("from department");
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Integer id) {
		Department dept = (Department)getHibernateTemplate().load(Department.class, id);
		getHibernateTemplate().delete(dept);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insert(Object o) {
		getHibernateTemplate().save(o);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(Object o) {
		getHibernateTemplate().update(o);	
	}

}
