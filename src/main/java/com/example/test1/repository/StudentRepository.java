package com.example.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test1.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findById(int Id);
}
