package com.jing.dao;
import com.jing.domain.*;
import java.util.List;


public interface IEmpDao {
    public Object findByUsername(String username);
    public List<Object> findByAll();
    public void delete(String username);
    public void insert(Object o);
    public void update(Object o);
    public List isLoginSuccess(String username, String password);
    public boolean hasSameUsername(String username);
    public Employee updateSynn(Employee e1, Employee e2, String[] arr);
}
