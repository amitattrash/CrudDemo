package com.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.crud.beans.Course;

@Component
public interface CourseService {
	public List<Course> getAllCourses();
	public Course getCourse(String courseId);
	public Course updateCourse(Course course);
	public void deleteCourse(String courseId);
	public Course addCourse(Course course);
}
