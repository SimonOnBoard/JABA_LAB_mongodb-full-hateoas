package ru.itis.kpfu.simononboard.mongodb.driver.application;

import ru.itis.kpfu.simononboard.mongodb.driver.models.Type;

public class TypeCodec extends AbstractCodec<Type>{
    public TypeCodec() {
        super();
    }

    @Override
    public Class<Type> getEncoderClass() {
        return Type.class;
    }
}
