package kr.ac.kopo.psjjj._026example.repository;

import kr.ac.kopo.psjjj._026example.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
