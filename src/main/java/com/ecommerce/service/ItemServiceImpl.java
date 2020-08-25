package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.dto.ResponseDto;
import com.ecommerce.exception.ItemNotFoundException;
import com.ecommerce.model.Item;
import com.ecommerce.repository.ItemRepository;


@Service
public class ItemServiceImpl implements ItemService {

@Autowired
ItemRepository itemRepository;
	@Override
	public List<ItemDto> getItems(String searchByItems) throws ItemNotFoundException {


		List<Item> items = itemRepository.findByItemNameContaining(searchByItems);
		 if(items.isEmpty()) {
			 throw new ItemNotFoundException("item not found with the given name");
		 } 
		 List<ItemDto> itemsDto = new ArrayList<>();
		 for(int i = 0;i<items.size();i++) {
			 ItemDto itemResponse = new ItemDto();
			 Item item = new Item();
			 item=items.get(i);
			 BeanUtils.copyProperties(item, itemResponse);
			 itemsDto.add(itemResponse);
		 }
		 
		 return itemsDto;
	}



}


/*List<Item> list= itemRepository.findByItemNameContaining(searchByItems);

//logger.info("vendor details are set");
if(list != null) {

return list;
}
else 
{
 throw new ItemNotFoundException("Given item not in the list ");
}
}*/

