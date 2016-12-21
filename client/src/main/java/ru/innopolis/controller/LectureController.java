package ru.innopolis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.model.LectureModel;
import ru.innopolis.service.LectureService;

/**
 * Created by Ekaterina on 18.12.2016.
 */
@Controller
public class LectureController {
    @Autowired
    LectureService lectureService;

    @GetMapping(value = "/lecture/add")
    public ModelAndView addLecture(){
        return new ModelAndView("add_lecture");
    }

    @PostMapping(value = "/lecture/add")
    public ModelAndView addLectureHandle(LectureModel lectureModel){
        lectureService.addLecture(lectureModel);
        return new ModelAndView("add_lecture");
    }

    @GetMapping(value = "/lecture/all")
    public ModelAndView getAllLectures(){
        return null;
    }
}
