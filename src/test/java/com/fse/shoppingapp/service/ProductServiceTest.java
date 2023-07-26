package com.fse.shoppingapp.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.fse.shoppingapp.exception.ProductsNotFound;
import com.fse.shoppingapp.models.Product;
import com.fse.shoppingapp.repository.ProductRepository;
import com.fse.shoppingapp.security.services.ProductService;


@SpringBootTest
@ActiveProfiles("test")
public class ProductServiceTest {
	
	 @MockBean
	    private ProductRepository productRepository;


	    @Autowired
	    private ProductService productService;
	    
//	    @Test
//	    public void testGetAllProducts() {
//	        // Set up mock data
//	        List<Product> products = new ArrayList<>();
//	        Product product1 = new Product( "Shoes", "Puma", 16999, "Lightweight", 10, "Out Of Stock");
//	        products.add(product1);
//
//	        // Set up mock behavior
//	        when(productRepository.findAll()).thenReturn(products);
//
//	        // Call the method under test
//	        List<Product> result = productService.getAllProducts();
//
//	        // Assert the result
//	        assertEquals(products, result);
//	    }
//	    
//	    @Test
//	    void getProductByName() {
//	        // Set up mock data
//	        List<Product> products = new ArrayList<>();
//	        products.add(new Product( "Shoes", "Puma", 16999, "Lightweight", 10, "Out Of Stock"));
//	        products.add(new Product( "Headphone", "Apple", 29999, "Wireless", 10, "HURRY UP TO PURCHASE"));
//	        products.add(new Product( "Iphone", "Apple", 69999, "gyro", 10, "Out Of Stock"));
//	        when(productRepository.findByProductName("Headphone")).thenReturn(
//	        	products.stream().filter(m -> m.getProductName().equals("Headphone")).findAny().orElse(null)
//	        		);
//
//	        // Call the method being testeds
//	        Product result = productService.getProductByName("Headphone");
//
//	        // Assert the results
//	        assertEquals("Headphone", result.getProductName());
//	    }
//	    
//	    @Test
//		void searchProductByNameProductNotFoundException() throws Exception {
//			when(productRepository.findByProductName("XYZ")).thenReturn(null);
//			Exception exception = assertThrows(ProductsNotFound.class,
//					() -> productService.getProductByName("XYZ"));
//			assertEquals("Products Not Found", exception.getMessage());
//		}
	    

}
