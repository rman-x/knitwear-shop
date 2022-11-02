package edu.omstu.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    @JsonIgnore
    private Item item;
    
    @Column(name = "parent_id", insertable = false, updatable = false)
    private Long parentId;

    @Column(name = "title")
    public String title;

    @Column(name = "price")
    public Integer price;

    @Column(name = "image_url", nullable = true)
    public String imageUrl;

    public CartItem(Long parentId, String title, Integer price, String imageUrl) {
        this.parentId = parentId;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}
