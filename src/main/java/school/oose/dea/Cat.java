package school.oose.dea;

public class Cat implements IAnimal {

    private static final String MIAUW = "Miauw";

    public String makeSound(int howMany) {

        StringBuilder returnValue = new StringBuilder();

        for (int i = 0; i < howMany; i++) {
            returnValue.append(MIAUW);
        }

        return returnValue.toString();
    }
}