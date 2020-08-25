package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.dto.ResponseDto;
import com.ecommerce.model.Item;



public interface ItemService {
	 List<ItemDto> getItems(String searchByItems);
}
