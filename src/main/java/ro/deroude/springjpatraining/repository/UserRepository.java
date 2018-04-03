package ro.deroude.springjpatraining.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.deroude.springjpatraining.domain.User;

/**
 *
 * @author valentin.raduti
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

    @Query("select u from User u where u.status=:status")
    public Page<User> findByStatus(@Param("status") String status, Pageable page);
}
