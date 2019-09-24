package ir.shayandaneshvar.apifactory.repositories;

import ir.shayandaneshvar.apifactory.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
