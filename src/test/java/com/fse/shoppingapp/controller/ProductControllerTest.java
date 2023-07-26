package com.fse.shoppingapp.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fse.shoppingapp.models.Product;
import com.fse.shoppingapp.security.services.ProductService;


@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class ProductControllerTest {
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
    private ProductService productService;
	
//	@Test
//    void getAllProductsAndNoneFound() throws Exception {
//        authenticateUser();
//        // Use MockMvc to send a GET request to the /api/v1.0/shopping/all endpoint
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1.0/shopping/all"))
//                .andExpect(status().isNotFound());
//    }
	
//    @Test
//    void getAllProductsAndFound() throws Exception {
//        List<Product> products = new ArrayList<>();
//        Product product1 = new Product( "Shoes", "Puma", 16999, "Lightweight", 10, "Out Of Stock");
//        products.add(product1);
//
//        when(productService.getAllProducts()).thenReturn(products);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1.0/shopping/all"))
//                .andExpect(status().isFound());
//    }
//    
//    @Test
//    public void testGetProductByNameAndFound() throws Exception {
//        String productName = "Iphone";
//        Product p= new Product( "Iphone", "Apple", 69999, "gyro", 10, "Out Of Stock");
//        when(productService.getProductByName(productName)).thenReturn(p);
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1.0/shopping/products/search/{productName}", productName))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.productName",org.hamcrest.Matchers.is(productName)));
//    }
    

	
    private void authenticateUser(){
        // Mock the authentication process
        SecurityContextHolder.getContext().setAuthentication(
                new UsernamePasswordAuthenticationToken(
                        "testUser", "testPassword", List.of(new SimpleGrantedAuthority("ROLE_USER"))
                )
        );
    }
    

}
