package com.mindefdb.services;

import java.util.List;

import com.mindefdb.dtos.ProductDTOV1;
import com.mindefdb.dtos.ProductDTOV2;

public interface IProductService {

	List<ProductDTOV1> getAllProductsV1();

	List<ProductDTOV2> getAllProductsV2();

}
