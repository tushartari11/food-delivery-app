package com.rekreation.app.fooddelivery.restaurantlisting.mapper;

import com.rekreation.app.fooddelivery.restaurantlisting.dto.RestaurantDTO;
import com.rekreation.app.fooddelivery.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
