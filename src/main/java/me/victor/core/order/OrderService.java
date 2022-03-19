package me.victor.core.order;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:48 PM
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
