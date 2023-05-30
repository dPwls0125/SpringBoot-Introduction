package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional; // 인터페이스 클래스.


public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional _ null 값을 객체로 변환
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
