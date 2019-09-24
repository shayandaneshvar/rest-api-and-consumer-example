package ir.shayandaneshvar.apifactory.repositories;

import ir.shayandaneshvar.apifactory.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
