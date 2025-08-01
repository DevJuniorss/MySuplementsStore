package com.mysuplementstore.spring.DTO;


import com.mysuplementstore.spring.Models.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long productId;
    private int quantity;

}
