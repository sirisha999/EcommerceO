package com.ecommerce.ItemControllerTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import com.ecommerce.controller.ItemController;
import com.ecommerce.dto.ItemDto;
import com.ecommerce.exception.ItemNotFoundException;
import com.ecommerce.model.Item;
import com.ecommerce.service.ItemService;
import com.ecommerce.service.ItemServiceImpl;


@RunWith(MockitoJUnitRunner.Silent.class)
public class ItemControllerTest {
	
	 @InjectMocks
	 ItemController itemController;
	 
	 @Mock
	 ItemServiceImpl itemServiceImpl;
	 
	
	 @Test
	    public void TestGetItemByNameForPositive() throws ItemNotFoundException {
	    	 List<ItemDto> items = new ArrayList<>();
	    	 Item item=new Item();
	    	 item.setItemId(2);
	    	 item.setItemName("noodles");
	    	 item.setPricePerUnit(150);
	    	 Mockito.when(itemServiceImpl.getItems(Mockito.anyString())).thenReturn(items);        
			ResponseEntity<List<ItemDto>> result=itemController.getItemsByName("noodles");
			Assert.notNull(result);
	    }
	 
	 @Test
	    public void TestGetItemByNameForNegative() throws ItemNotFoundException {
		 List<ItemDto> items = new ArrayList<>();
    	 Item item=new Item();
    	 item.setItemId(-2);
    	 item.setItemName("noodles");
    	 item.setPricePerUnit(150);
    	 Mockito.when(itemServiceImpl.getItems(Mockito.anyString())).thenReturn(items);        
		ResponseEntity<List<ItemDto>> result=itemController.getItemsByName("noodles");
		Assert.notNull(result);
    }
 
}
