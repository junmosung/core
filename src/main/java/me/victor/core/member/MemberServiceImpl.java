package me.victor.core.member;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:09 PM
 */
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemmoryMemberRepository();    // 현재 문제점은 추상화(MemberRepository)에도 의존하고, 구체화(MemmoryMemberRepository)에도 의존하는 안좋은 코드이다.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findMemberById(id);
    }
}
