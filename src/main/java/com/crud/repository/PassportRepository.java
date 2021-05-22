package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.beans.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
