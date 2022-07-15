package by.epam.learn.order;

import java.util.*;

public class OrderMain {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(10));
        orders.add(new Order(3));
        orders.add(new Order(17));
        orders.add(new Order(1));
        orders.add(new Order(3));
        OrderAction action = new OrderAction();
        Optional<Order> optional = action.findById(orders, 3);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        Set<Order> set = new HashSet<>();
        optional.ifPresent(set::add);
        System.out.println(set);
     }
}
