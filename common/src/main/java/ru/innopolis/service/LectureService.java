package ru.innopolis.service;

import ru.innopolis.model.LectureModel;

import java.util.List;

/**
 * Created by Ekaterina on 19.12.2016.
 */
public interface LectureService {
    void addLecture(LectureModel lecture);

    List<LectureModel> getAll();
}
