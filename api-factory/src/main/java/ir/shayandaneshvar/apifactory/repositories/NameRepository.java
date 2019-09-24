package ir.shayandaneshvar.apifactory.repositories;

import ir.shayandaneshvar.apifactory.domain.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
