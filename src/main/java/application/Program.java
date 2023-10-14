package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

/**
 * Hello world!
 *
 */

public class Program
{
    public static void main( String[] args )
    {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENTS);
        System.out.println(order);
    }
}
