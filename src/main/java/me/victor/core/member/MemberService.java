package me.victor.core.member;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 8:08 PM
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long id);

}
