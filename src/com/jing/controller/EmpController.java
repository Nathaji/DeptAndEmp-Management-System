package com.jing.controller;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jing.dao.*;
import com.jing.domain.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpController extends MultiActionController{
    private IEmpDao empDao;
    private IDeptDao deptDao;
    
	public IEmpDao getEmpDao() {
		return empDao;
	}
	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}
	public IDeptDao getDeptDao() {
		return deptDao;
	}
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res){
    	Employee u = new Employee();
    	u.setUsername(req.getParameter("Employeename"));
    	u.setPassword(req.getParameter("password"));
        this.empDao.insert(u);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("message", "Successfully Registered! Please login with your account.");
    	return mv;
    }
    
    public ModelAndView update(HttpServletRequest req, HttpServletResponse res){
    	Employee empNow = (Employee)req.getSession().getAttribute("emp");
    	Employee u = new Employee();
    	String[] arr = {req.getParameter("password"),req.getParameter("name"),req.getParameter("sex"),
    			req.getParameter("contact"),req.getParameter("dept"),req.getParameter("position")};
    	this.empDao.update(this.empDao.updateSynn(empNow, u, arr));
    	req.getSession().setAttribute("emp", u);
    	return new ModelAndView("index", "message", "Successfull updated");
    	
    }
  
    public ModelAndView showInfo(HttpServletRequest req, HttpServletResponse res){
    	String username = req.getParameter("username");
    	Employee e = (Employee)this.empDao.findByUsername(username);
    	Map map = new HashMap();
		Department dept = (Department)this.deptDao.findById(e.getDept());
		map.put("emp", e);
		map.put("dept", dept);
    	return new ModelAndView("empInfo", "map", map);
    }
    
    public ModelAndView delete(HttpServletRequest req, HttpServletResponse res){
    	String username = req.getParameter("username");
    	this.empDao.delete(username);
    	ModelAndView mv = new ModelAndView("logout");
    	mv.addObject("message","Successfully deleted");
    	return mv;
    }
    
    public ModelAndView findByUsername(HttpServletRequest req, HttpServletResponse res){
    	String username = req.getParameter("username");
    	Employee e = (Employee)this.empDao.findByUsername(username);
    	return new ModelAndView("update", "emp", e);
    } 
}
