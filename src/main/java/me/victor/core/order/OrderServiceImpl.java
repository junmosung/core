package me.victor.core.order;

import me.victor.core.discount.DiscountPolicy;
import me.victor.core.discount.FixDiscountPolicy;
import me.victor.core.member.Member;
import me.victor.core.member.MemberRepository;
import me.victor.core.member.MemmoryMemberRepository;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:50 PM
 */
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemmoryMemberRepository();
    private final DiscountPolicy DiscountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member byId = memberRepository.findMemberById(memberId);
        int discount = DiscountPolicy.discount(byId, itemPrice);

        return new Order(memberId, itemName, itemPrice, discount);
    }
}
