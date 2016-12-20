package ru.innopolis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.model.StudentModel;
import ru.innopolis.service.StudentService;

/**
 * Created by Ekaterina on 18.12.2016.
 */
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/student/add")
    public ModelAndView addStudent() {
        return new ModelAndView("add_student");
    }

    @PostMapping(value = "/student/add")
    public ModelAndView addStudentHandle(StudentModel studentModel) {
        return studentService.addStudent(studentModel);
    }
}
