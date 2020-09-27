package com.rest.springdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Courses;

public interface courseDao extends JpaRepository<Courses, Long>{

	
	
}
