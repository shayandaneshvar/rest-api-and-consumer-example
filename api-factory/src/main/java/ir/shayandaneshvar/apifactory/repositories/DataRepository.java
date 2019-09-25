package ir.shayandaneshvar.apifactory.repositories;

import ir.shayandaneshvar.apifactory.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository  extends JpaRepository<Data,Long> {
}
