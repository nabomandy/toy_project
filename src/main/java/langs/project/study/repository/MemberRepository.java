package langs.project.study.repository;

import org.apache.ibatis.javassist.compiler.ast.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    //4가지 기능을 만듬
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findByID(Long id);
    //Optional는 자바8에 들어가 있는 기능
    Optional<Member> findByName(String name);
    List<Member> findAll(); //저장된 회원리스트를 전부 반환

}
