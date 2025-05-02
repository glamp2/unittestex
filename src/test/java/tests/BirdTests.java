package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Bird;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BirdTests {

    private static Bird actualBird;

    @BeforeAll
    public static void createAnimals()
    {
        actualBird = new Bird(AnimalType.DOMESTIC, Skin.FEATHERS, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualBird.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Speak Cheep Tests")
    public void birdGoesCheepTest()
    {
        assertEquals("The bird goes cheep! cheep!", actualBird.speak(), "I was expecting cheep");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Feathers is it Hypoallergenic")
    public void birdHypoallergenicTests()
    {
        assertEquals("The bird is not hypoallergenic!", actualBird.birdHypoallergenic(),
                "The bird is not hypoallergenic!");
    }

    @Test
    @Order(1)
    @DisplayName("Bird has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualBird.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Bird Gender Test Female")
    public void genderTestFemale()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualBird.getGender(), "Expecting Female Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Breed Test CARDINAL")
    public void genderBirdBreed()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.CARDINAL);
        assertEquals(Breed.CARDINAL, actualBird.getBreed(), "Expecting Breed Cardinal!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Caw Tests")
    public void birdGoesCawTest()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes caw! caw!", actualBird.speak(), "I was expecting caw");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Cluck Tests")
    public void birdGoesCluckTest()
    {
        actualBird = new Bird(AnimalType.FARM, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes cluck! cluck!", actualBird.speak(), "I was expecting cluck");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Chirp Tests")
    public void birdGoesChirpTest()
    {
        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes chirp! chirp!", actualBird.speak(), "I was expecting chirp");
    }
}
