package com.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.beans.Course;
import com.crud.beans.Review;
import com.crud.repository.CourseRepository;
import com.crud.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourse(String courseId) {
		Course course = courseRepository.findById(courseId).orElse(new Course());
		List<Review> reviewList = course.getReviewList();
		System.out.println("Review List>>>"+reviewList);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);

	}

	@Override
	public Course addCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

}
