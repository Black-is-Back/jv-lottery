package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Color [] colors = Color.values();
        final int maxNumber = 100;
        int randomColor = random.nextInt(colors.length);
        int number = random.nextInt(maxNumber);
        return new Ball(colors[randomColor].name(), number);
    }
}
