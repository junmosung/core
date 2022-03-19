package me.victor.core.discount;

import me.victor.core.member.Grade;
import me.victor.core.member.Member;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:41 PM
 */
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {

        // enum type은 == 비교이다.
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
