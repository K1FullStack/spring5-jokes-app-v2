package guru.springframework.spring5_jokes_app_v2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {
  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
