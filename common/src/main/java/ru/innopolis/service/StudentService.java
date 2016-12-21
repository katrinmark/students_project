package ru.innopolis.service;

import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.model.StudentModel;

/**
 * Created by Ekaterina on 19.12.2016.
 */
public interface StudentService {
    ModelAndView addStudent(StudentModel studentModel);
}
