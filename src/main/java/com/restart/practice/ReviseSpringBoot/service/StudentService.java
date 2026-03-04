package com.restart.practice.ReviseSpringBoot.service;

import com.restart.practice.ReviseSpringBoot.dto.AddStudentRequestDto;
import com.restart.practice.ReviseSpringBoot.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
    void deleteStudentById(Long id);
    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}
