package revengineer.muscle_backend_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import revengineer.muscle_backend_app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
