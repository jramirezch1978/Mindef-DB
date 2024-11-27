package com.mindefdb.controllers.codeshttp;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mindefdb.services.IProductService;

import jakarta.validation.Valid;

import com.mindefdb.dtos.ProductDTO;
import com.mindefdb.handler.MethodArgumentNotValidException;
import com.mindefdb.handler.ResourceNotFoundException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    // 200 OK: Respuesta exitosa
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable Long id) {
        try {
			return ResponseEntity.ok(productService.findById(id));
		} catch (MethodArgumentNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
        
    }

    // 201 CREATED: Recurso creado exitosamente
    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO product) {
        ProductDTO created = productService.create(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        				.path("/{id}")
        				.buildAndExpand(created.getId())
        				.toUri();
        
        return ResponseEntity.created(location).body(created);
    }

    // 204 NO CONTENT: Operación exitosa sin contenido de retorno
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // 404 NOT FOUND: Recurso no encontrado
    @GetMapping("/find/{sku}")
    public ResponseEntity<ProductDTO> findBySku(@PathVariable String sku) throws ResourceNotFoundException {
        return productService.findBySku(sku)  // Asumiendo que esto retorna Optional<ProductDTO>
            .map(ResponseEntity::ok)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found with SKU: " + sku));
    }
}
