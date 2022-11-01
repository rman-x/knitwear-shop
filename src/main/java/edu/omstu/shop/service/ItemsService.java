package edu.omstu.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.omstu.shop.model.Item;
import edu.omstu.shop.repository.ItemsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemsService {
    
    private final ItemsRepository repository;

    public List<Item> findAll() {
        return repository.findAll();
    }
}
