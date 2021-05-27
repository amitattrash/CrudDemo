package com.crud.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Review implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String reviewId;
	@Column
	private int reviewRating;
	@Column
	private String reviewComment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;
	 
	public Review() {
		super();
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Review(String reviewId, int reviewRating, String reviewComment) {
		this.reviewId = reviewId;
		this.reviewRating = reviewRating;
		this.reviewComment = reviewComment;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public int getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(int reviewRating) {
		this.reviewRating = reviewRating;
	}
	public String getReviewComment() {
		return reviewComment;
	}
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewRating=" + reviewRating + ", reviewComment=" + reviewComment
				+ "]";
	}
}
