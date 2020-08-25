package com.ecommerce.dto;

import java.util.List;

public class ResponseDto {
	private List<ItemDto> itemDto;

	public List<ItemDto> getItemDto() {
		return itemDto;
	}

	public void setItemDto(List<ItemDto> itemDto) {
		this.itemDto = itemDto;
	}

}