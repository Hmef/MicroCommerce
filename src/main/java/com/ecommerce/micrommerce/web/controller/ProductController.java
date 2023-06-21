package com.ecommerce.micrommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.micrommerce.web.dao.ProductDao;
import com.ecommerce.micrommerce.web.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;

    

    @GetMapping("/produits")
    public List<Product> listeProduits() {
        return productDao.findAll();
    }

    @GetMapping(value = "/produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
      
    	//simuler la récupération d'un produit dans la base de données.
    	  Product product = new Product(id, new String("Aspirateur"), 100);
          return product;
    	
    	//return productDao.findById(id);
    }

}
