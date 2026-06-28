package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Color [] colors =  Color.values();
        int randomColor = random.nextInt(colors.length);
        int number = random.nextInt(100);
        return new Ball(colors[randomColor].toString(),number);
    }
}
