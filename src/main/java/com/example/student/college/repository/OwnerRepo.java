package com.example.student.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.college.model.Owner;

@Repository
public interface OwnerRepo extends JpaRepository<Owner,Integer> {
}
