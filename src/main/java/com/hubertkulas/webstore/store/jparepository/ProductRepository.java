package com.hubertkulas.webstore.store.jparepository;

import com.hubertkulas.webstore.store.archetype.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Using Jpa for CRUD operations
public interface ProductRepository extends JpaRepository<Product, Long> {
}
