package com.hubertkulas.webstore.store.controllers;


import com.hubertkulas.webstore.store.archetype.Product;
import com.hubertkulas.webstore.store.jparepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ver01/product")
public class ProductController {

    //injecting ProductRepository when ProductController is called
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> list() {
        //finds all of the records and returns it
       return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Product product){
        productRepository.save(product);
    }



    @GetMapping("/{id}")
    public Product get(@PathVariable("id") long id){
        // return specific record with added id
        return productRepository.getOne(id);
    }

}
