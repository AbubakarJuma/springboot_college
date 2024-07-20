package com.example.student.college.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.college.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login,Long> {
}
