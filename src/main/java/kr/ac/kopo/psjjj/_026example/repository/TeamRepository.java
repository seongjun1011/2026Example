package kr.ac.kopo.psjjj._026example.repository;

import kr.ac.kopo.psjjj._026example.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
