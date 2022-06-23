/*
package com.gunmProg.PizzaShop.Models.Mappers;


import com.gunmProg.PizzaShop.Models.Dtos.ProductDto;
import com.gunmProg.PizzaShop.Models.Entities.Product;
import com.gunmProg.PizzaShop.Models.Entities.ShoppingCart;
import com.gunmProg.jwtAccount.Model.mappers.UserMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = { ShoppingCartMapper.class, UserMapper.class})
public interface ProductMapper {


    Product convertToProduct (ProductDto productDto);

    @Mapping( target= "id", ignore=true )
    ProductDto convertToProductDto (Product product);

  */
/*  ProductMapper productDtoToProduct (ProductDto productDto);

    @InheritInverseConfiguration
    ProductDto productToProductDto (Product product);

    ProductDto productToProductDto (List<Product> findById);

    Product productToProductDto (ProductDto productDto);


    ProductDto productToProductDto(Optional<Product> byId);*//*

}
*/
