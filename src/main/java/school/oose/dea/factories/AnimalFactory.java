package school.oose.dea.factories;

import school.oose.dea.AnimalType;

import school.oose.dea.IAnimal;
import school.oose.dea.adapters.CatAdapter;
import school.oose.dea.adapters.DogAdapter;

public class AnimalFactory
{
    private static AnimalFactory factory;

    public static AnimalFactory getInstance() {
        if (factory == null) {
            factory = new AnimalFactory();
        }

        return factory;
    }

    public static IAnimal create(AnimalType type)
    {
        switch (type)
        {
            case CAT:
                return new CatAdapter();
            case DOG:
                return new DogAdapter();
            default:
                return null;
        }
    }
}
