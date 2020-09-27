package com.rest.services;
import java.util.*;

import com.rest.entity.Courses;
public interface CourseServices {

public List<Courses> getCourses() ;

public Courses getCourses(long courseId);

public Courses addCourse(Courses courses);

public Courses updateCourse(Courses courses);

public void deleteCourse(long parseLonng);
}
