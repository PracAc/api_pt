package org.example.api_pt.product.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="tbl_review")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String content;

    private Long score;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ElementCollection
    @CollectionTable(name = "tbl_review_img")
    @Builder.Default
    private Set<ContentImage> images = new HashSet<>();

    public void changeImages(Set<ContentImage> images) {
        this.images = images;
    }
}
