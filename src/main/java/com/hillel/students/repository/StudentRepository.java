package com.hillel.students.repository;

import com.hillel.students.domain.student.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
