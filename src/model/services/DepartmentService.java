package model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.entity.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		
		List<Department> list = new ArrayList<>();
		
		Department dp1 = new Department(1, "Books");
		Department dp2 = new Department(2, "Computers");
		Department dp3 = new Department(3, "Electronics");
		
		list.addAll(Arrays.asList(dp1, dp2, dp3));
		
		return list;	
		
	}

}
