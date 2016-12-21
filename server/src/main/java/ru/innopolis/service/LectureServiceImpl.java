package ru.innopolis.service;

import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.innopolis.dao.LectureDAO;
import ru.innopolis.entity.Lecture;
import ru.innopolis.model.LectureModel;
import ru.innopolis.utils.BaseMapper;

import java.util.List;

/**
 * Created by Ekaterina on 19.12.2016.
 */
@Component
public class LectureServiceImpl implements LectureService {

    private MapperFacade mapper = BaseMapper.MAPPER_FACADE;

    @Autowired
    LectureDAO lectureDAO;

    @Override
    public void addLecture(LectureModel lectureModel) {
        Lecture lecture = mapper.map(lectureModel, Lecture.class);
        lectureDAO.addLecture(lecture);
    }

    @Override
    public List<LectureModel> getAll() {
       // lectureDAO.getAll();
        return null;
    }
}
