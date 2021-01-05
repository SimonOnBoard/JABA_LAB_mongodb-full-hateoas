package ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
import ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.models.Product;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {
    @RestResource(path = "availablebyTagSizeTagsContains", rel = "availableTagsSearch", exported = false)
    @Query("{ tags: { $size: ?0 , $in: ?1}, status: 'AVAILABLE' }")
    List<Product> findAllByTagsSizeAndTagsContains(int count, List<String> tags);
}
