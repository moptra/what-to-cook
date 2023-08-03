package hu.hobby.whattocook.repository;

import hu.hobby.whattocook.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomUserRepository extends JpaRepository<CustomUser, Long> {
    @Query("SELECT u FROM CustomUser u WHERE u.userId =:username")
    Optional<CustomUser> findByName(@Param("username")String username);
}
