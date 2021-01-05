package ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.hateoas.LinkRelation;
import org.springframework.hateoas.server.LinkRelationProvider;

@SpringBootApplication
public class MongodbFullHateoasQuerydslApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbFullHateoasQuerydslApplication.class, args);
    }

}
