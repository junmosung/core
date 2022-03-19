package me.victor.core.member;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by victorsung.
 * Date: 2022/03/19
 * Time: 7:56 PM
 */
public class MemmoryMemberRepository implements MemberRepository {

    private static ConcurrentHashMap<Long, Member> store = new ConcurrentHashMap<>();   // 실무에서는 동시성 이슈때문에 Hashtable 클래스의 단점을 보완하면서 Multi-Thread 환경에서 사용할 있는 ConcurrentHashMap 사용한다.

    @Override

    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findMemberById(Long memberId) {
        return store.get(memberId);
    }
}
