package org.example.api_pt.product.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "tags")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    private String pname;
    private int price;

    @ElementCollection
    @CollectionTable(name = "tbl_product_tag")
    @Builder.Default
    private Set<String> tags = new HashSet<>();

    public void addTag(String tag) {
        tags.add(tag);
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    public void clearTag() {
        tags.clear();
    }

    @ElementCollection
    @CollectionTable(name = "tbl_product_img")
    @Builder.Default
    private Set<ContentImage> images = new HashSet<>();

    public void changeImages(Set<ContentImage> images) {
        this.images = images;
    }

}
