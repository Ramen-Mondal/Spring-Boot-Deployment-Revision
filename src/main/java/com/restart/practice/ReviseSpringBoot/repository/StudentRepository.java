package com.restart.practice.ReviseSpringBoot.repository;

import com.restart.practice.ReviseSpringBoot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {}
