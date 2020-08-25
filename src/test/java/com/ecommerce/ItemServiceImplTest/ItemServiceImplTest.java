package com.ecommerce.ItemServiceImplTest;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ecommerce.dto.ItemDto;
import com.ecommerce.exception.ItemNotFoundException;
import com.ecommerce.model.Item;
import com.ecommerce.repository.ItemRepository;
import com.ecommerce.service.ItemServiceImpl;



@RunWith(MockitoJUnitRunner.Silent.class)
public class ItemServiceImplTest {
	
	@InjectMocks
	ItemServiceImpl itemServiceImpl;
	
	@Mock
	ItemRepository itemRepository;
	
	@Test
    public void TestviewItemByNameForPositive() throws ItemNotFoundException {
        
		List<Item> items =new ArrayList<>();
		Item item=new Item();
   	     item.setItemId(2);
   	    item.setItemName("noodles");
   	     item.setPricePerUnit(150);
    
		items.add(item); 
        
        Mockito.when(itemRepository.findByItemNameContaining(Mockito.anyString())).thenReturn(items);
        List<ItemDto> result=itemServiceImpl.getItems(item.getItemName());
        assertNotNull(result);
        
    }

	@Test
    public void TestviewItemByNameForNegative() throws ItemNotFoundException  {
		List<Item> items =new ArrayList<>();
		Item item=new Item();
  	    item.setItemId(-2);
  	    item.setItemName("noodles");
  	    item.setPricePerUnit(150);
   
		items.add(item); 
        
        Mockito.when(itemRepository.findByItemNameContaining(Mockito.anyString())).thenReturn(items);
        List<ItemDto> result=itemServiceImpl.getItems(item.getItemName());
        assertNotNull(result);
        
    }

}
