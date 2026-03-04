package com.restart.practice.ReviseSpringBoot.controller;

import com.restart.practice.ReviseSpringBoot.dto.AddStudentRequestDto;
import com.restart.practice.ReviseSpringBoot.dto.StudentDto;
import com.restart.practice.ReviseSpringBoot.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public StudentDto getStudentDto(){
        return new StudentDto(4L,"Admin","admin@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/students")
    public List<StudentDto> getStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @PatchMapping("{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id, @RequestBody Map<String,Object> update){
        return ResponseEntity.ok(studentService.updatePartialStudent(id,update));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDto));
    }
}
