package com.inclassteach.crud.done.service;

import com.inclassteach.crud.done.entity.Student;
import com.inclassteach.crud.done.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;


    public Student saveStudent(Student student){
        return repo.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repo.saveAll(students);
    }

    public Student getStudentById(int id){
        return repo.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return repo.findByName(name);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
        System.out.println("Student deleted");
    }

    public Student updateStudent(Student student){
        Student existingStudent = repo.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setGrade(student.getGrade());
        return repo.save(existingStudent);
    }
}
