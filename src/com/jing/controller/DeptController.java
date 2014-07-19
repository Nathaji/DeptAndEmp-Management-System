package com.jing.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jing.dao.*;
import com.jing.domain.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class DeptController extends MultiActionController{
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
		Department dept = new Department();
		dept.setDeptNum(Integer.valueOf(req.getParameter("deptNum")));
		dept.setDeptName(req.getParameter("deptName"));
		dept.setDeptInfo(req.getParameter("deptInfo"));
		this.deptDao.insert(dept);
		return showDept(req, res);
	}
	
	public ModelAndView showDept(HttpServletRequest req, HttpServletResponse res){
		List list = this.deptDao.findByAll();
		return new ModelAndView("deptInfo", "list", list);
	}
	
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res){
		Department dept = new Department();
		dept.setDeptNum(Integer.valueOf(req.getParameter("deptNum")));
		dept.setDeptName(req.getParameter("deptName"));
		dept.setDeptInfo(req.getParameter("deptInfo"));
		this.deptDao.update(dept);
		return showDept(req, res);
	}
	
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res){
		Integer deptNum = Integer.valueOf(req.getParameter("deptNum"));
        if(this.empDao.noEmp(deptNum)){
        	this.deptDao.delete(deptNum);
        	return showDept(req, res);
        }else{
        	PrintWriter out;
			try {
				out = res.getWriter();
				out.print("<script type='text/javascript'");
	        	out.print("alert('Dept is not empty');");
	        	out.print("window.location='DeptController.html?method=showDept';");
	        	out.print("</script>");
	        	out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
        	
        }
	}
	
	public ModelAndView findById(HttpServletRequest req, HttpServletResponse res){
		Department dept = (Department)this.deptDao.findById(Integer.valueOf(req.getParameter("deptNum")));
		return new ModelAndView("deptUpdate", "dept", dept);
	}
	
	
    
}
