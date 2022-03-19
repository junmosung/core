package me.victor.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:18 PM
 */
public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    @DisplayName("서비스")
    void 맴버서비스(){
    	// given ~이러이러한 환경이 주어졌을때
        Member memberA = new Member(1L, "memberA", Grade.BASIC);

        // when ~이렇게 했을때
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);

        // then ~ 이렇게 된다.
        Assertions.assertThat(memberA).isEqualTo(findMember);
        Assertions.assertThat(findMember.getId()).isEqualTo(1L);
    }
}