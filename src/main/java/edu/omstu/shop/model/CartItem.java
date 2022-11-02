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

    @Column(name = "title", nullable = true)
    public String getTitle() {
        if (item != null) { 
            return item.getTitle();
        } return null;
    }

    @Column(name = "price", nullable = true)
    public Integer getPrice() {
        if (item != null) { 
        return item.getPrice();
        } return null;
    }

    @Column(name = "image_url", nullable = true)
    public String getImageUrl() {
        if (item != null) {
        return item.getImageUrl();
        } return null;
    }

    public CartItem(Long parentId) {
        this.parentId = parentId;
    }
}
