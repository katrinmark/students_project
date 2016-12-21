package ru.innopolis.utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by Ekaterina on 20.12.2016.
 */
public class EntityManagerHolder {
    private static final EntityManager ENTITY_MANAGER = Persistence.createEntityManagerFactory("mysql").createEntityManager();

    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER;
    }
}
