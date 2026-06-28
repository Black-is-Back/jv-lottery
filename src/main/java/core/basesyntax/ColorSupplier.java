package core.basesyntax;

import java.awt.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color [] colors =  Color.values();
        int index = random.nextInt(colors.length);
        return  colors[index].toString();
    }
}
