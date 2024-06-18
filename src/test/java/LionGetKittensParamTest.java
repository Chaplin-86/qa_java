import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


@RunWith( Parameterized.class)
public class LionGetKittensParamTest{

@Mock
Feline feline;


@Parameterized.Parameter
public String sex;
@Parameterized.Parameter(1)
public int kittensCount;

@Parameterized.Parameters
public static Object[][] data() {
    return new Object[][] {
            {"Самец", 1},
            {"Самка", 1}
    };
}

@Before
public void setUp() {
    MockitoAnnotations.openMocks(this);
}

@Test
    public void getKittensParamTest() throws Exception {
    Lion lion = new Lion(feline, sex);

    int expected = 1;
    Mockito.when(feline.getKittens()).thenReturn(1);
    int actual = lion.getKittens();

    Assert.assertEquals(expected, actual);

}


}
