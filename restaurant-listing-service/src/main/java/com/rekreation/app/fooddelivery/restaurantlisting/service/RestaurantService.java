package com.rekreation.app.fooddelivery.restaurantlisting.service;

import com.rekreation.app.fooddelivery.restaurantlisting.dto.RestaurantDTO;
import com.rekreation.app.fooddelivery.restaurantlisting.entity.Restaurant;
import com.rekreation.app.fooddelivery.restaurantlisting.mapper.RestaurantMapper;
import com.rekreation.app.fooddelivery.restaurantlisting.repo.RestaurantRepo;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

  @Autowired RestaurantRepo restaurantRepo;

  public List<RestaurantDTO> findAllRestaurants() {
    List<Restaurant> restaurants = restaurantRepo.findAll();
    List<RestaurantDTO> restaurantDTOList =
        restaurants.stream()
            .map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant))
            .collect(Collectors.toList());
    return restaurantDTOList;
  }

  public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
    Restaurant savedRestaurant =
        restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO));
    return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(savedRestaurant);
  }

  public ResponseEntity<RestaurantDTO> fetchRestaurantById(Integer id) {
    Optional<Restaurant> restaurant = restaurantRepo.findById(id);
    return restaurant.map(value -> new ResponseEntity<>(
            RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(value), HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
  }
}
