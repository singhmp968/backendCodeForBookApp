package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Courses;
import com.rest.services.CourseServices;
import com.rest.services.courseServiceImp;

import java.util.*;
@RestController
public class MyController {
	@Autowired
	private CourseServices courseServiceImp;	
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home";
	}
	//get the courses
	@CrossOrigin(origins = "http://localhost:3001")
	@GetMapping("/courses")
	public List<Courses> getCourse() 
	{
		return this.courseServiceImp.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) 
	{
		return this.courseServiceImp.getCourses(Long.parseLong(courseId));
	}
	@CrossOrigin(origins = "http://localhost:3001")
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) 
	{
		return this.courseServiceImp.addCourse(course);
	}
	
	
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) 
	{
		return this.courseServiceImp.updateCourse(course);
	}
	
	
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId){
		try {
			this.courseServiceImp.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
} 
