package com.jing.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.jing.dao.*;
import com.jing.domain.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class LoginController extends MultiActionController{
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
	
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res){
		String loginUsername = req.getParameter("username");
		String loginPassword = req.getParameter("password");
		List list = this.empDao.isLoginSuccess(loginUsername, loginPassword);
		if(list.isEmpty()){
			return new ModelAndView("index", "message", "Username or Password is not correct!");
		}else{
			Employee e = (Employee)list.get(0);
			if(e.getIsAdmin()){
				
				return new ModelAndView("manage");
			}else{
				Map map = new HashMap();
				Department dept = (Department)this.deptDao.findById(e.getDept());
				map.put("emp", e);
				map.put("dept", dept);
				return new ModelAndView("empInfo", "map", map);
			}
		}	
	}
    
    
}
