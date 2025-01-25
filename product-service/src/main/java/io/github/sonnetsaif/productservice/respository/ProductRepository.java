package io.github.sonnetsaif.productservice.respository;

import io.github.sonnetsaif.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
