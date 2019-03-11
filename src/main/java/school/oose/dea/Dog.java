package school.oose.dea;

import java.util.stream.IntStream;

public class Dog implements IAnimal{

    private static final String BARK = "Woef";

    public String makeSound(int howMany) {

        var returnValue = new StringBuilder();

        IntStream.range(0, howMany).forEach(value -> returnValue.append(BARK));

        return returnValue.toString();
    }
}