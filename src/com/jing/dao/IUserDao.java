package com.jing.dao;
import com.jing.domain.User;
import java.util.*;

public interface IUserDao {
    public void insert(User u);
    public void update(User u);
    public void delete(Integer id);
    public List<Object> findByAll();
    public List<Object> findByDept(Integer deptNum);
    public User findById(Integer id);
	public User updateSynn(User userNow, User u, String[] arr);
	public List<Object> findByUsernamePassword(String username, String password);
	
}
