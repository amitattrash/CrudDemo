package com.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.crud.beans.Review;
@Component
public interface ReviewService {
	public List<Review> getAllReviews();
	public Review getReview(String reviewId);
	public Review updateReview(Review review);
	public void deleteReview(String reviewId);
	public Review addReview(Review review);
}
