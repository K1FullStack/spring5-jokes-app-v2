package guru.springframework.spring5_jokes_app_v2.controllers;

import guru.springframework.spring5_jokes_app_v2.services.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class JokeController {
  private final JokeService jokeService;

  @RequestMapping({"/", ""})
  public String showJoke(Model model) {
    model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }
}
