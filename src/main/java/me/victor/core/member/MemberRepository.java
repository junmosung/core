package me.victor.core.member;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 7:55 PM
 */
public interface MemberRepository {

    void save(Member member);

    Member findMemberById(Long memberId);

}
