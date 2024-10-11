package org.example.api_pt.product;

import lombok.extern.log4j.Log4j2;
import org.example.api_pt.product.domain.ContentImage;
import org.example.api_pt.product.domain.Product;
import org.example.api_pt.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.HashSet;
import java.util.Set;

@DataJpaTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInsert() {

        Set<ContentImage> images = new HashSet<>();

        Product product = Product.builder()
                .pname("Test")
                .price(5000)
                .images()
                .build();

    }

}
