package org.example.api_pt.product.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    private String pname;
    private int price;

    @ElementCollection
    @CollectionTable(name = "tbl_product_img")
    @Builder.Default
    private Set<ContentImage> images = new HashSet<>();

    public void changeImages(Set<ContentImage> images) {
        this.images = images;
    }

}
