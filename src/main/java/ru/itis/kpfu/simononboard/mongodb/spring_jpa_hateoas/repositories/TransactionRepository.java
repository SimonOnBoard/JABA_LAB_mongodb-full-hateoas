package ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.models.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, ObjectId> {
}
