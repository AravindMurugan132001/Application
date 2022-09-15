package com.nseit.Application.repository;

import com.nseit.Application.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    boolean findByStudentId();
}
