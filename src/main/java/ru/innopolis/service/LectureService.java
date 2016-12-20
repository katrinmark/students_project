package ru.innopolis.service;

import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.model.LectureModel;

/**
 * Created by Ekaterina on 19.12.2016.
 */
public interface LectureService {
    ModelAndView addLecture(LectureModel lecture);

    ModelAndView getAll();
}
