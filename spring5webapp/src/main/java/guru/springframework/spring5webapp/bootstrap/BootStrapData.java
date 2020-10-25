package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created By Giancarlo on 24-10-2020
 */
@Component
public class BootStrapData implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(BootStrapData.class);

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;
  private final PublisherRepository publisherRepository;

  public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                       PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    logger.info("Started in Bootstrap");

    Publisher publisher = new Publisher();
    publisher.setName("Publishing");
    publisher.setCity("Lima");
    publisher.setState("PE");

    this.publisherRepository.save(publisher);

    logger.info("Publisher count: {}", this.publisherRepository.count());

    Author gian = new Author("Gian", "Yarleque");
    Book ddd = new Book("Domain Driver Design", "123123");
    gian.getBooks().add(ddd);
    ddd.getAuthors().add(gian);

    ddd.setPublisher(publisher);
    publisher.getBooks().add(ddd);

    this.authorRepository.save(gian);
    this.bookRepository.save(ddd);
    this.publisherRepository.save(publisher);

    Author rod = new Author("Rod", "Johnson");
    Book noEJB = new Book("J2EE Development without EJB", "3939254323");
    rod.getBooks().add(noEJB);
    noEJB.getAuthors().add(rod);

    noEJB.setPublisher(publisher);
    publisher.getBooks().add(noEJB);

    this.authorRepository.save(rod);
    this.bookRepository.save(noEJB);
    this.publisherRepository.save(publisher);

    logger.info("Number of Books: {}", this.bookRepository.count());
    logger.info("Publisher Number of Books: {}", publisher.getBooks().size());
  }
}
