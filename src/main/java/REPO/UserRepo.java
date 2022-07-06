package REPO;


import domaine.Appuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Appuser,Long> {
    Appuser findByUserName(String username);
}
