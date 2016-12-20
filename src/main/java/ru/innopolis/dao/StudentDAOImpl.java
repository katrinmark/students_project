package ru.innopolis.dao;

import org.springframework.stereotype.Component;
import ru.innopolis.utils.EntityManagerHolder;
import ru.innopolis.entity.Student;

import javax.persistence.EntityManager;

/**
 * Created by Ekaterina on 20.12.2016.
 */
@Component
public class StudentDAOImpl implements StudentDAO{
    public void addStudent(Student student) {
        EntityManager entityManager = EntityManagerHolder.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }
}
