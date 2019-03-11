package school.oose.dea.controllers;

import school.oose.dea.AnimalType;
import school.oose.dea.factories.AnimalFactory;

import javax.ws.rs.*;

@Path("/")
public class AnimalController
{
    @GET
    public String hello()
    {
        return "hello world";
    }

//    @GET
//    @Path("{number}")
//    @Produces("text/html")
//    public String number(@PathParam("number") int number)
//    {
//        return String.valueOf(number);
//    }

    @GET
    @Path("{number}")
    @Produces("text/html")
    public String getAnimalSounds(@PathParam("number") int number, @QueryParam("animal") String animal)
    {
        var response = "";
        if ("cat".equals(animal))
        {
            var cat = AnimalFactory.getInstance().create(AnimalType.CAT);
            response = cat.makeSound(number);
        }
        else if("dog".equals(animal))
        {
            var dog = AnimalFactory.getInstance().create(AnimalType.DOG);
            response = dog.makeSound(number);
        }
        return response;
    }
}
