package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created By Giancarlo on 11/3/2020
 */
@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return this.chuckNorrisQuotes.getRandomQuote();
  }
}
