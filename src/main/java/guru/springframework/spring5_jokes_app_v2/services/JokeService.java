package guru.springframework.spring5_jokes_app_v2.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
  String getJoke();
}
