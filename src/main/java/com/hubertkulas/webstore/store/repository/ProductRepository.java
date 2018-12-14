package com.hubertkulas.webstore.store.repository;

import com.hubertkulas.webstore.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Using Jpa for CRUD operations
public interface ProductRepository extends JpaRepository<Product, Long> {
}
