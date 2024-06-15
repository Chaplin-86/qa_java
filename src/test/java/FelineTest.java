import com.example.Feline;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith( MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
   public void getKittensTest(){
        feline.getKittens(1);
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> eatMeatExpected = List.of("Животные", "Птицы", "Рыбы");
        Mockito.when(feline.getFood("Хищник")).thenReturn(eatMeatExpected);
        //Feline feline = new Feline();
        List<String> eatMeatActual = feline.eatMeat();
        Assert.assertEquals(eatMeatExpected, eatMeatActual);

    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();

        String actual = feline.getFamily();
        String expected = "Кошачьи";

        Assert.assertEquals(expected, actual);

    }
}

