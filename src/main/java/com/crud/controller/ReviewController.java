package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.beans.Review;
import com.crud.service.ReviewService;

@RestController
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/reviews")
	public List<Review> getAllReviews(){
		return reviewService.getAllReviews();
	} 
	
	@GetMapping("/reviews/{reviewId}")
	public Review getReview(@PathVariable String reviewId) {
		return reviewService.getReview(reviewId);
	}	
	
	@PostMapping("/reviews")
	public Review saveReview(@RequestBody Review review) {
		return reviewService.addReview(review);
	}
	
	@DeleteMapping("/reviews/{reviewId}")
	public void deleteReview(String reviewId) {
		reviewService.deleteReview(reviewId);
	}
	
	@PutMapping("/reviews")
	public void updateReview(@RequestBody Review review) {
		reviewService.updateReview(review);
	}
	
}
