package langs.project.study.repository;

import org.apache.ibatis.javassist.compiler.ast.Member;

import java.util.List;
import java.util.Optional;

public class OracleMemberRepository implements MemberRepository{

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
