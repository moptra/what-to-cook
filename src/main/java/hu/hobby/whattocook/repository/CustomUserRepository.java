package hu.hobby.whattocook.repository;

import hu.hobby.whattocook.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomUserRepository extends JpaRepository<CustomUser, Long> {
}
