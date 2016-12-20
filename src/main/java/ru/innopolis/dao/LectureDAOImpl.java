package ru.innopolis.dao;

import org.springframework.stereotype.Component;
import ru.innopolis.utils.EntityManagerHolder;
import ru.innopolis.entity.Lecture;

import javax.persistence.EntityManager;

/**
 * Created by Ekaterina on 20.12.2016.
 */
@Component
public class LectureDAOImpl implements LectureDAO{
    public void addLecture(Lecture lecture) {
        EntityManager entityManager = EntityManagerHolder.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(lecture);
        entityManager.getTransaction().commit();
    }
}
