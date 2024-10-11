package org.example.api_pt.product;


import lombok.extern.log4j.Log4j2;
import org.example.api_pt.product.repository.ReviewRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReviewTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    @Commit
    @Transactional
    public void testReviewInsert(){

    }

}
