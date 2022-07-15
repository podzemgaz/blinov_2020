package by.epam.learn.order;

import java.util.List;
import java.util.Optional;

public class OrderAction {
    public Optional<Order> findById(List<Order> orders, long id) {

        Optional<Order> optionalOrder = orders.stream().filter(order -> id == order.getOrderId()).findAny();
        return optionalOrder;
    }
}
