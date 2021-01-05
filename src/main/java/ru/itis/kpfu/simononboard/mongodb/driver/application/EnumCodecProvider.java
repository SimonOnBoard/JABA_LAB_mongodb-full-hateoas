package ru.itis.kpfu.simononboard.mongodb.driver.application;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import ru.itis.kpfu.simononboard.mongodb.driver.models.Status;
import ru.itis.kpfu.simononboard.mongodb.driver.models.Type;

public class EnumCodecProvider implements CodecProvider {
    @Override
    public <T> Codec<T> get(Class<T> clazz, CodecRegistry registry) {
        if (clazz == Status.class) {
            return (Codec<T>) new StatusTypeCodec();
        }
        if (clazz == Type.class) {
            return (Codec<T>) new TypeCodec();
        }
        return null; // Don't throw here, this tells Mongo this provider doesn't provide a decoder for the requested clazz
    }
}