package ru.innopolis.utils;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by Ekaterina on 20.12.2016.
 */
public class BaseMapper {
    public static final MapperFactory MAPPER_FACTORY = new DefaultMapperFactory.Builder().build();
}
