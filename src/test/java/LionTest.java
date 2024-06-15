import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith( MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodFemaleTest() throws Exception  {
        Lion lion = new Lion(feline, "Самка");

        List<String> foodExpected = List.of("Животные", "Птицы", "Рыбы");

        Mockito.when(feline.getFood("Хищник")).thenReturn(foodExpected);

        List<String> foodActual = lion.getFood();

        Assert.assertEquals(foodExpected, foodActual);

    }

    @Test
    public void getFoodMaleTest() throws Exception  {
        Lion lion = new Lion(feline, "Самец");

        List<String> foodExpected = List.of("Животные", "Птицы", "Рыбы");

        Mockito.when(feline.getFood("Хищник")).thenReturn(foodExpected);

        List<String> foodActual = lion.getFood();

        Assert.assertEquals(foodExpected, foodActual);

    }

    @Test
    public void getFoodNegative() {

        try {
        Lion lion = new Lion(feline, "Симба");
        lion.getFood();
        } catch (Exception exception) {
        System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }

    }

    @Test
    public void getKittensFemaleTest() throws Exception {
        Lion lion = new Lion (feline, "Самка");

        int expected = 1;

        Mockito.when(feline.getKittens()).thenReturn(1);

        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getKittensMaleTest() throws Exception {
        Lion lion = new Lion (feline, "Самец");

        int expected = 0;

        Mockito.when(feline.getKittens()).thenReturn(0);

        int actual = lion.getKittens();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getKittensNegative() {

        try {
            Lion lion = new Lion(feline, "Симба");
            lion.getKittens();
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }

    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion (feline, "Самец");

        boolean expected = true;
        boolean actual = lion.doesHaveMane();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion (feline, "Самка");

        boolean expected = false;
        boolean actual = lion.doesHaveMane();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void doesHaveManeNegative() {

        try {
            Lion lion = new Lion(feline, "Симба");
            lion.doesHaveMane();
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }

    }



}
