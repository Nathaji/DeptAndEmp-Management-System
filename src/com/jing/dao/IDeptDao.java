package com.jing.dao;

import java.util.List;

public interface IDeptDao {
    public Object findById(Integer id);
    public List<Object> findByAll();
    public void delete(Integer id);
    public void insert(Object o);
    public void update(Object o);
}
