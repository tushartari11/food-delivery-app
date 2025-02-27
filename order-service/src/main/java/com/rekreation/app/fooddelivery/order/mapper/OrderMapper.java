package com.rekreation.app.fooddelivery.order.mapper;

import com.rekreation.app.fooddelivery.order.dto.OrderDTO;
import com.rekreation.app.fooddelivery.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}