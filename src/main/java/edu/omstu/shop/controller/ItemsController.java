package edu.omstu.shop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.omstu.shop.model.Item;
import edu.omstu.shop.service.ItemsService;
import lombok.RequiredArgsConstructor;

@RestController()
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemsController {
    private final ItemsService service;

    @GetMapping()
    public List<Item> getAll() {
        return service.findAll();
    }
    
}
