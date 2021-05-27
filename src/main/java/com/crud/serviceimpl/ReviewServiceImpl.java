package com.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.beans.Review;
import com.crud.repository.ReviewRepository;
import com.crud.service.ReviewService;
@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public List<Review> getAllReviews() {
		return reviewRepository.findAll();
	}

	@Override
	public Review getReview(String reviewId) {
		return reviewRepository.findById(reviewId).orElse(new Review());
	}

	@Override
	public Review updateReview(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public void deleteReview(String reviewId) {
		reviewRepository.deleteById(reviewId);
	}

	@Override
	public Review addReview(Review review) {
		return reviewRepository.save(review);
	}

}
