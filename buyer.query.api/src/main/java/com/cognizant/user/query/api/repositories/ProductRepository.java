package com.cognizant.user.query.api.repositories;

import com.cognizant.user.core.models.Product;
import com.cognizant.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{'$or' : [{'name': {$regex : ?0, $options: '1'}}, {'price': {$regex : ?0, $options: '1'}}]}")
    List<Product> findByFilterRegex(String filter);
}
