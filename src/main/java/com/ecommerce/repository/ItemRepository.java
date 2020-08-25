	package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.model.Item;



public interface ItemRepository extends JpaRepository<Item,Integer> {
	List<Item> findByItemNameContaining(String searchByItems);
	
}
