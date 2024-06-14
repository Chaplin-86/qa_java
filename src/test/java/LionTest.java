import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith( Parameterized.class)

public class LionTestOfGettingFoodWithParameters {

    @Mock
    private Feline feline;



    @Test
    public void getFoodTest() throws Exception  {
        Lion lion = new Lion(sex, feline);
        this.sex = sex;
        List<String> foodExpected = List.of("Животные", "Птицы", "Рыбы");

        Mockito.when(feline.getFood("Хищник")).thenReturn(foodExpected);

        List<String> foodActual = lion.getFood();

        Assert.assertEquals(foodExpected, foodActual);

    }


}
