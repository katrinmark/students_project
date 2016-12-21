package ru.innopolis.dao;

import org.springframework.stereotype.Component;
import ru.innopolis.entity.Lecture;
import ru.innopolis.utils.EntityManagerHolder;

import javax.persistence.EntityManager;

/**
 * Created by Ekaterina on 20.12.2016.
 */
@Component
public class LectureDAOImpl implements LectureDAO{
    private EntityManager entityManager = EntityManagerHolder.getEntityManager();

    public void addLecture(Lecture lecture) {
        entityManager.getTransaction().begin();
        entityManager.merge(lecture);
        entityManager.getTransaction().commit();
    }
}
