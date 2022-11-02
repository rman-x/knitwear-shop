package edu.omstu.shop.service;

import java.util.List;
import edu.omstu.shop.model.CartItem;
import org.springframework.stereotype.Service;

import edu.omstu.shop.repository.CartRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CartService {
    
    private final CartRepository repository;

    public List<CartItem> findAll() {
        return repository.findAll();
    }

    public CartItem save(CartItem item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
