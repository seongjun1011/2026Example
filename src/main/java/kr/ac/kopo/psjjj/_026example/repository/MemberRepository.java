package kr.ac.kopo.psjjj._026example.repository;

import kr.ac.kopo.psjjj._026example.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member3, Integer>{

}