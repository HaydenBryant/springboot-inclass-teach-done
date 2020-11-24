package com.inclassteach.crud.done.repository;

import com.inclassteach.crud.done.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    Student findByName(String name);
}
