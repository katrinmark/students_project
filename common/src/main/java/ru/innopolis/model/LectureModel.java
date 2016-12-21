package ru.innopolis.model;

import java.io.Serializable;

/**
 * Created by Ekaterina on 18.12.2016.
 */

public class LectureModel implements Serializable{

    private static final long serialVersionUID = -3266427056428612315L;
    private Long id;
    private String name;

    public LectureModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
