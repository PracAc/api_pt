package org.example.api_pt.product;

import lombok.extern.log4j.Log4j2;
import org.example.api_pt.product.domain.ContentImage;
import org.example.api_pt.product.domain.Product;
import org.example.api_pt.product.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@DataJpaTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    @Commit
    @Transactional
    public void testInsert() {

        for (int i = 0; i < 50; i++) {


        Set<ContentImage> productImages = new HashSet<>();
        productImages.add(new ContentImage(0,"Testimage.jpg"));
        productImages.add(new ContentImage(1,"Testimage1.jpg"));
        productImages.add(new ContentImage(2,"Testimage2.jpg"));

        Product product = Product.builder()
                .pname("Test"+i)
                .price(5000)
                .images(productImages)
                .build();

            product.addTag("AAA");
            product.addTag("BBB");
            product.addTag("CCC");

            productRepository.save(product);
        }

    }

}
