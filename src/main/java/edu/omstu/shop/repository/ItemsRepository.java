package edu.omstu.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.omstu.shop.model.Item;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long> {
    List<Item> findAll();
}
