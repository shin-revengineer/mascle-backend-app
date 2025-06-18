package revengineer.mascle_backend_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import revengineer.mascle_backend_app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
