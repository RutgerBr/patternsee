package school.oose.dea.adapters;

import school.oose.dea.Cat;
import school.oose.dea.IAnimal;

public class CatAdapter implements IAnimal
{
    Cat cat;

    public CatAdapter()
    {
        Cat dog = new Cat();
    }
    @Override
    public String makeSound(int number)
    {
        Cat cat = new Cat();
        return cat.makeSound(number);
    }
}
