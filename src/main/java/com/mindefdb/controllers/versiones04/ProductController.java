package com.mindefdb.controllers.versiones04;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindefdb.services.IProductService;
import com.mindefdb.dtos.ProductDTOV1;
import com.mindefdb.dtos.ProductDTOV2;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
    
	//curl http://localhost:8080/api/products?version=1
    @GetMapping(params = "version=1")
    public List<ProductDTOV1> getProductsV1() {
        return productService.getAllProductsV1();
    }
    
    //curl http://localhost:8080/api/products?version=2
    @GetMapping(params = "version=2")
    public List<ProductDTOV2> getProductsV2() {
        return productService.getAllProductsV2();
    }
}