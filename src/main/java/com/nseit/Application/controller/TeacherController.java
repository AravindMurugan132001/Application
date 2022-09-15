package com.nseit.Application.controller;

import com.nseit.Application.model.Teacher;
import com.nseit.Application.response.APIResponse;
import com.nseit.Application.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    public TeacherService teacherService;

    private APIResponse apiResponse;
//    @Secured({Role.ROLE_ADMIN})
    @PostMapping
    public ResponseEntity<APIResponse> addTeacher(@RequestBody TeacherRequst teacherRequst) {
        Teacher
        teacherService.addTeacher(teacher);
    }

    @PutMapping
    public void updateTeacher(@RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
    }

    @GetMapping("/all")
    public List<Teacher> viewTeacher() {
        return teacherService.viewTeacher();
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable int id) {
        teacherService.deleteTeacher(id);
    }
}
