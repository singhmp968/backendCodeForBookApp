package com.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Courses;
import com.rest.springdao.courseDao;
@Service
public class courseServiceImp implements CourseServices{
	
	@Autowired
	private courseDao courseDao;
	public courseServiceImp() {
	
	}
		
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
	return courseDao.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
		// TODO Auto-generated method stub
		
			return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses courses) {
		// TODO Auto-generated method stub
		courseDao.save(courses);
		return courses;
		}

	@Override
	public Courses updateCourse(Courses courses) {
		// TODO Auto-generated method stub
courseDao.save(courses);
	return courses;	
	}

	@Override
	public void deleteCourse(long parseLonng) {
		// TODO Auto-generated method stub
	Courses courses1 = courseDao.getOne(parseLonng);
	courseDao.delete(courses1);	
	}


	
	
	
	
	
	
	
	
	//	List<Courses> list;
//	public courseServiceImp() {
//		list = new ArrayList<>();
//		list.add(new Courses(145,"faffqfe" , "ivdnjivsiufd"));
//		list.add(new Courses(152,"ascadvade" , "isiufd"));
//		list.add(new Courses(155,"faffe" , "ivdnjiv"));
//	}
//	
//	
//	
//	
//	
//	@Override
//	public List<Courses> getCourses() {
//		// TODO Auto-generated method stub
//		return list;
//	}
//
//	@Override
//	public Courses getCourses(long courseId) {
//		// TODO Auto-generated method stub
//		
//		Courses c = null;
//		for(Courses courses : list) {
//			if(courses.getId() == courseId) {
//				c = courses;
//				break;
//			}
//		}
//		return c;
//	}
//
//	@Override
//	public Courses addCourse(Courses courses) {
//		// TODO Auto-generated method stub
//		list.add(courses);
//		
//		return courses;
//	}
//
//	@Override
//	public Courses updateCourse(Courses courses) {
//		// TODO Auto-generated method stub
//
//		list.forEach(e->{
//			if(e.getId() == courses.getId()) {
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//			}
//		});
//		
//		return courses;
//	}
//
//	@Override
//	public void deleteCourse(long parseLonng) {
//		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e->e.getId()!=parseLonng).collect(Collectors.toList());
//		
//	}

}
