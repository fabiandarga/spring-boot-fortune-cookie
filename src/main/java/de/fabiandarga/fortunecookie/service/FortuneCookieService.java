package de.fabiandarga.fortunecookie.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FortuneCookieService {

    private static final List<String> FORTUNES = List.of(
        "A bug fix is just around the corner.",
        "Keep calm and refactor.",
        "Good code is its own best documentation.",
        "Your next commit will fix all the bugs.",
        "May your code be clean and your variables meaningful.",
        "Fortune favors the coder who tests.",
        "Debugging is like being a detective in a crime movie where you are also the murderer.",
        "Simplicity is the soul of efficiency.",
        "Happiness is... a well-named variable.",
        "Your next idea will change the world!"
    );

    private final Random random = new Random();

    public String getRandomFortune() {
        int index = random.nextInt(FORTUNES.size());
        return FORTUNES.get(index);
    }
}
