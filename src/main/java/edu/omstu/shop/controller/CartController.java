package edu.omstu.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.omstu.shop.model.CartItem;
import edu.omstu.shop.service.CartService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    
    private final CartService service;

    @GetMapping()
    public List<CartItem> getAll() {
        return service.findAll();
    }

    @PostMapping()
    public CartItem create(@RequestBody CartItem item) {
        return service.save(item);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

}
