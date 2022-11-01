package edu.omstu.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
