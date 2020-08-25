package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.exception.ItemNotFoundException;
import com.ecommerce.model.Item;
import com.ecommerce.service.ItemServiceImpl;


@RestController
@RequestMapping("/items")
public class ItemController {
@Autowired 
ItemServiceImpl itemserviceimpl;

@GetMapping("")
	public ResponseEntity<List<ItemDto>> getItemsByName(@RequestParam String itemName) throws ItemNotFoundException {
		//logger.info("<---------<inside item controller method>------>");
		 List<ItemDto> item =   itemserviceimpl.getItems(itemName);
		return new ResponseEntity<>(item, HttpStatus.OK);
	}
}

/*
* @GetMapping("/{search/{searchByItemsOrvendor}") public List<ResponseDto>
* getItems(@RequestParam(required = false) String searchByItemsOrvendor) {
*/
	/*	List<Item> item = itemserviceimpl.getItems(itemName);
		return new  ResponseEntity<List<Item>>(item,HttpStatus.OK);
	}
	*/



