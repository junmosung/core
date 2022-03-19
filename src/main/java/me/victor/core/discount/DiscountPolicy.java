package me.victor.core.discount;

import me.victor.core.member.Member;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:38 PM
 */
public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
