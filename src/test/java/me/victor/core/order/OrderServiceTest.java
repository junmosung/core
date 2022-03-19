package me.victor.core.order;

import me.victor.core.member.Grade;
import me.victor.core.member.Member;
import me.victor.core.member.MemberService;
import me.victor.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 9:29 PM
 */
public class OrderServiceTest {

    private MemberService memberService = new MemberServiceImpl();
    private OrderService orderService = new OrderServiceImpl();

    @Test
    @DisplayName("주문")
    void 주문TEST() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // when
        Order order = orderService.createOrder(findMember.getId(), "itemA", 10000);

        // then
        Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);
    }

}