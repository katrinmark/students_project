package ru.innopolis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.dao.StudentDAO;
import ru.innopolis.entity.Student;
import ru.innopolis.model.StudentModel;
import ru.innopolis.utils.BaseMapper;

/**
 * Created by Ekaterina on 19.12.2016.
 */
@Component
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDAO studentDAO;

    @Override
    public ModelAndView addStudent(StudentModel studentModel) {
        ModelAndView modelAndView = new ModelAndView("add_student");
        Student student = BaseMapper.MAPPER_FACTORY.getMapperFacade().map(studentModel, Student.class);
        studentDAO.addStudent(student);
        return modelAndView;
    }
}
