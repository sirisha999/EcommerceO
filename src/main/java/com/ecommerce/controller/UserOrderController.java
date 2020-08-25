/*
 * package com.ecommerce.controller;
 * 
 * import javax.validation.Valid;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.ecommerce.dto.OrderRequestDto; import
 * com.ecommerce.service.UserOrderServiceImpl;
 * 
 * @RestController public class UserOrderController {
 * 
 * @Autowired UserOrderServiceImpl userOrderServiceImpl;
 * 
 * @PostMapping("/order") public ResponseEntity<String>
 * orderFood(@Valid @RequestBody OrderRequestDto orderRequestDto) { Double price
 * = userOrderServiceImpl.orderFood(orderRequestDto);
 * 
 * ResponseEntity<String> response =
 * bankingClient.phoneNumberBasedTransfer(orderRequestDto.getPhone(),
 * toPhoneNumber, new BigDecimal(price));
 * 
 * //logger.info(ApplicationContants.ORDER_SUCCESS); return new
 * ResponseEntity<>(ApplicationContants.ORDER_SUCCESS + " and ",
 * HttpStatus.CREATED); }
 * 
 * }
 */