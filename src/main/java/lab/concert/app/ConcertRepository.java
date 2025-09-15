package lab.concert.app;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import lab.concert.app.domain.Concert;

public interface ConcertRepository extends CrudRepository<Concert, Long> {

    // Spring Data JPA will implement this automatically
    Optional<Concert> findByTitle(String title);
}
