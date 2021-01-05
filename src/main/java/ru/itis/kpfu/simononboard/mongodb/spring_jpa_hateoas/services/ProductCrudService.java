package ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.services;

import ru.itis.kpfu.simononboard.mongodb.spring_jpa_hateoas.models.Product;

public interface ProductCrudService {
    Product makeAvailable(String objectId);
}
