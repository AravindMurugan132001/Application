package com.nseit.Application.service;

import com.nseit.Application.model.Teacher;
import com.nseit.Application.repository.TeacherRepository;
import com.nseit.Application.request.TeacherRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public teacher addTeacher(TeacherRequest teacherRequest){
        Teacher teacher=new Teacher();
        BeanUtils.copyProperties(teacherRequest, teacher);
        teacherRepository.save(teacher);
    }
    public void updateTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public List<Teacher> viewTeacher(){
        return teacherRepository.findAll();
    }
    public void deleteTeacher(int id){
        for(Teacher teacher : teacherRepository.findAll()){
            if(id==teacher.getId()){
                teacherRepository.delete(teacher);
            }
        }
    }
}
