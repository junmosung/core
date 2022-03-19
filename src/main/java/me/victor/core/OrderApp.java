package me.victor.core;

import me.victor.core.member.Grade;
import me.victor.core.member.Member;
import me.victor.core.member.MemberService;
import me.victor.core.member.MemberServiceImpl;
import me.victor.core.order.Order;
import me.victor.core.order.OrderService;
import me.victor.core.order.OrderServiceImpl;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:54 PM
 */
public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createOrder(memberA.getId(), "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
