package com.jing.dao;

import java.util.List;
import com.jing.domain.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class EmpDao extends HibernateDaoSupport implements IEmpDao{

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Object findByUsername(String username) {
		return (Employee)getHibernateTemplate().get(Employee.class, username);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Object> findByAll() {
		return getHibernateTemplate().find("from employee");
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(String username) {
		Employee e = (Employee)getHibernateTemplate().load(Employee.class, username);
		getHibernateTemplate().delete(e);
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

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public List isLoginSuccess(String username, String password) {
		
		String sql = "from employee where username='"+username+"'and password='"+password+"'";
		return getHibernateTemplate().find(sql);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public boolean hasSameUsername(String username) {
		String sql = "from employee where username='"+username+"'";
		List list = getHibernateTemplate().find(sql);
		return list.size()==0;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public boolean noEmp(Integer dept){
		List list = getHibernateTemplate().find("from employee where dept='" + dept +"'");
		return list.isEmpty();
	}
	
	 public Employee updateSynn(Employee u1, Employee u2, String[] arr){
         u2.setUsername(u1.getUsername());
      	if(!arr[0].equals("")){
             u2.setPassword(arr[0]);
   	    }else{
   		     u2.setPassword(u1.getPassword());
   	    }
   	    if(!arr[1].equals("")){
            u2.setName(arr[1]);
    	}else{
    		u2.setName(u1.getName());
    	}
     	if(!arr[2].equals("")){
           u2.setSex(arr[2]);
    	}else{
    		u2.setSex(u1.getSex());
    	}
     	if(!arr[3].equals("")){
            u2.setContact(arr[3]);
    	}else{
    		u2.setContact(u1.getContact());
    	}
     	if(!arr[4].equals("")){
           u2.setDept(Integer.valueOf(arr[4]));
    	}else{
    		u2.setDept(u1.getDept());
    	}
     	if(!arr[5].equals("")){
            u2.setPosition(arr[5]);
     	}else{
     		u2.setPosition(u1.getPosition());
     	}
     	return u2;
     
   }

}
