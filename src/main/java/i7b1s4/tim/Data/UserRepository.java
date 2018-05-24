package i7b1s4.tim.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("user_repository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
