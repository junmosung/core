package me.victor.core;

import me.victor.core.member.Grade;
import me.victor.core.member.Member;
import me.victor.core.member.MemberService;
import me.victor.core.member.MemberServiceImpl;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:14 PM
 */
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "mamberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember.getName() = " + findMember.getName());
        System.out.println("findMember.getGrade() = " + findMember.getGrade());
    }
}
