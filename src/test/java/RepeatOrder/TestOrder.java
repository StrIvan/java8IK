package RepeatOrder;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestOrder {


    @Test
    public void testOrders() {
        Order firstOrder = new Order(47, true, "G");
        Order secondOrder = new Order(149, false, "Q");
        Order thirdOrder = new Order(251, true, "W");
        Order fourthOrder = new Order(250, false, "E");
        Order fifthOrder = new Order(123, true, "R");
        Order sixthOrder = new Order(321, false, "T");
        Order seventhOrder = new Order(470, true, "G");
        Order eightsOrder = new Order(4, false, "N");
        List<Order> orderList = Arrays.asList(firstOrder, secondOrder, thirdOrder, fourthOrder, fifthOrder, sixthOrder, seventhOrder, eightsOrder);
        Predicate<Order> predicateVegan = order ->order.price < 200 && order.isVegan;
        Predicate<Order> predicateOrderPrice = order ->order.price > 20 && order.price > 10;
        printConditions(orderList, predicateVegan.and(predicateOrderPrice));
        printConditions(orderList, predicateOrderPrice);

//        printConditions(orderList, new OrderCheck() {
//            @Override
//            public boolean checkConditions(Order order) {
//                return order.price <= 150 && order.isVegan;
//            }
//        });
    }

    public void printConditions(List<Order> orderList, Predicate<Order> predicate) {
        for (Order order : orderList) {
            if (predicate.test(order)) {
                System.out.println(order);
            }
        }

    }


}
