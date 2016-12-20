package ru.innopolis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import ru.innopolis.dao.LectureDAO;
import ru.innopolis.entity.Lecture;
import ru.innopolis.model.LectureModel;
import ru.innopolis.utils.BaseMapper;

/**
 * Created by Ekaterina on 19.12.2016.
 */
@Component
public class LectureServiceImpl implements LectureService {

    @Autowired
    LectureDAO lectureDAO;

    @Override
    public ModelAndView addLecture(LectureModel lectureModel) {
        ModelAndView modelAndView = new ModelAndView("add_lecture");
        Lecture lecture = BaseMapper.MAPPER_FACTORY.getMapperFacade().map(lectureModel, Lecture.class);
        lectureDAO.addLecture(lecture);
        return modelAndView;
    }

    @Override
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("all_lectures");
        return modelAndView;
    }
}
