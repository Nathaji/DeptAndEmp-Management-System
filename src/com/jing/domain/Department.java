package com.jing.domain;
import java.util.*;

public class Department {
   private Integer deptNum;
   private String deptName;
   private String deptInfo;
   private Set<Employee> emps;
   
   public Integer getDeptNum() {
	  return deptNum;
   }
   
   public void setDeptNum(Integer deptNum) {
	   this.deptNum = deptNum;
   }
   
   public String getDeptName() {
	   return deptName;
   }
   
   public void setDeptName(String deptName) {
	   this.deptName = deptName;
    }
   
   public String getDeptInfo() {
	   return deptInfo;
    }
   
   public void setDeptInfo(String deptInfo) {
	   this.deptInfo = deptInfo;
   }
   
   public Set<Employee> getEmps(){
	   return this.emps;
   }
   
   public void setEmps(Set<Employee> emps){
	   this.emps = emps;
   }
   
   
   
   
}
