package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;


@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private EntityManager mgr;

	@Override
	public List<Department> getDeptNames() {
		String jpql = "select d from Department d";
		System.out.println("lol");
		List<Department> d1 =mgr.createQuery(jpql, Department.class).getResultList();
		
		System.out.println(d1);
	
		return  d1;
	}

}
