package ru.itis.kpfu.simononboard.mongodb.driver.application;

import ru.itis.kpfu.simononboard.mongodb.driver.models.Status;

public class StatusTypeCodec extends AbstractCodec<Status>{
    public StatusTypeCodec() {
        super();
    }

    @Override
    public Class<Status> getEncoderClass() {
        return Status.class;
    }
}
