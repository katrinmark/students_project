package ru.innopolis.utils;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by Ekaterina on 20.12.2016.
 */
public class BaseMapper {
    public static final MapperFacade MAPPER_FACADE = new DefaultMapperFactory.Builder().build().getMapperFacade();
}
