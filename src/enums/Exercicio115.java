package enums;

import entities.Order;

import java.util.Date;

public class Exercicio115 {

    public void exercicio115(){

        Order order = new Order(10,new Date(), OrderStatus.DELIVERED);

        System.out.println(order.getId());
        System.out.println(order.getMoment());
        System.out.println(order.getStatus());

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
