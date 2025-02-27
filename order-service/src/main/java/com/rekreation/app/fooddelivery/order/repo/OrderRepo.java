package com.rekreation.app.fooddelivery.order.repo;

import com.rekreation.app.fooddelivery.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
}
