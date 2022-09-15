package com.nseit.Application.service;

import com.nseit.Application.exception.ResourceAlreadyExistException;
import com.nseit.Application.model.Student;
import com.nseit.Application.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        Student student = new Student();
        BeanUtils.copyProperties(studentRequest, student);

        boolean isStudentExist = studentRepository.findByStudentId(studentRequest.getStudentId()).isPresent();
        if (isStudentExist)
            throw new ResourceAlreadyExistException("Student already exists.");
        return StudentRepository.save(student);
    }

    public void updateStudent(studentRequest studentrequest) {
        Student student = new Student();
        BeanUtils.copyProperties(studentrequest, student);
        if (studentrequest.getId() = null)
            throw new ResourceNotFoundException("Student not Exist with this id "
                    + studentrequest.getId());
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.findById(Id).orElseThrow(() ->
                new ResourceNotFoundException("No Student with Id" + Id));
        studentRepository.deleteById(Id);
    }
    public List<Student> viewStudent() {

        return studentRepository.findAll();
    }
    public student findById(Integer Id){
        return studentRepository.findById(Id).orElseThrow(()->new ResourceAlreadyExistException("Unable to find student with id"+Id));
    }
}




