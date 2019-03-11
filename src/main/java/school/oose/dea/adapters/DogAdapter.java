package school.oose.dea.adapters;

import school.oose.dea.Dog;
import school.oose.dea.IAnimal;

public class DogAdapter implements IAnimal
{
    Dog dog;

    public DogAdapter()
    {
        Dog dog = new Dog();
    }

    @Override
    public String makeSound(int number)
    {
        return dog.makeSound(number);
    }
}
