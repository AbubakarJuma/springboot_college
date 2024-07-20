package com.example.student.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.college.model.Application;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer> {
}
