package com.jing.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.*;
import com.jing.dao.*;
import com.jing.domain.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{
    private IUserDao userDao;
    
    public IUserDao getuserDao(){
    	return this.userDao;
    }
    public void setuserDao(IUserDao userDao){
    	this.userDao = userDao;
    }
   
    public ModelAndView insert(HttpServletRequest req, HttpServletResponse res) throws IOException{
    	User u = new User();
    	u.setusername(req.getParameter("username"));
    	u.setpassword(req.getParameter("password"));
    	u.setcity(req.getParameter("city"));
    	u.setphone(req.getParameter("phone"));
    	u.setdeptNum(Integer.valueOf(req.getParameter("deptNum")));
    	
    	u.setisAdmin(req.getParameter("isAdmin"));
        this.userDao.insert(u);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Successfully Registered! Please login with your account.");
    	return mv;
    }
    
    public ModelAndView update(HttpServletRequest req, HttpServletResponse res){
    	Integer id = Integer.valueOf(req.getParameter("id"));
    	User userNow = (User)req.getSession().getAttribute("user");
    	User emp = this.userDao.findById(id);
    	
    	User u = new User();
    	String[] arr = {req.getParameter("password"),req.getParameter("city"),req.getParameter("phone"),req.getParameter("deptNum")};
    	if(userNow.getisAdmin().equals("0")){
    		this.userDao.update(this.userDao.updateSynn(emp, u, arr));
    	}else{
    	    this.userDao.update(this.userDao.updateSynn(userNow, u, arr));
        	req.getSession().setAttribute("user", u);
    	}
    	
    	ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Successfully updated");
    	return mv;
    }
  
  
    public ModelAndView findByAll(HttpServletRequest req, HttpServletResponse res){
    	List<Object> list = this.userDao.findByAll();
    	return new ModelAndView("display","list", list);
    }
    
    public ModelAndView delete(HttpServletRequest req, HttpServletResponse res){
    	Integer id = Integer.valueOf(req.getParameter("id"));
    	this.userDao.delete(id);
    	ModelAndView mv = new ModelAndView("logout");
    	mv.addObject("message","Successfully deleted");
    	return mv;
    }
    
    public ModelAndView findById(HttpServletRequest req, HttpServletResponse res){
    	Integer id = Integer.valueOf(req.getParameter("id"));
    	User user = this.userDao.findById(id);
    	return new ModelAndView("update", "user", user);
    }
    
    public ModelAndView findByDept(HttpServletRequest req, HttpServletResponse res){
    	Integer deptNum = Integer.valueOf(req.getParameter("deptNum"));
    	List<Object> list = this.userDao.findByDept(deptNum);
    	return new ModelAndView("display","list",list);
    }
}
