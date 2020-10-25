package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Giancarlo on 24-10-2020
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
