import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith( Parameterized.class)
public class LionDoesHaveManeParamTest {

@Mock
private Feline feline;

@Parameterized.Parameter
public String sex;
@Parameterized.Parameter(1)
public boolean doesHaveMane;

@Parameterized.Parameters
public static Object[][] data() {
    return new Object[][] {
            {"Самец", true},
            {"Самка", false}
    };
}

@Before
public void setUp() {
     MockitoAnnotations.openMocks(this);
    }

@Test
public void doesHaveManeParamTest() throws Exception {
    Lion lion = new Lion(feline, sex);

    boolean expected = lion.doesHaveMane();

    Assert.assertEquals(expected, doesHaveMane);


        }


}
