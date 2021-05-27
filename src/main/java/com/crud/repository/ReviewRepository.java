package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.beans.Review;

public interface ReviewRepository extends JpaRepository<Review, String> {

}
