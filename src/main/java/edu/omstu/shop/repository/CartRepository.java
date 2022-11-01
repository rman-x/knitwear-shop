package edu.omstu.shop.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.omstu.shop.model.CartItem;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findAll();
    void removeById(Long id);
}
