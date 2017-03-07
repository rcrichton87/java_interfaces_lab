import static org.junit.Assert.*;
import org.junit.*;

public class ChickenTest{
  Chicken chicken;

  @Before
  public void before(){
    chicken = new Chicken();
  }

  @Test
  public void chickenCanCluck(){
    assertEquals("Cluck", chicken.cluck());
  }

  @Test
  public void hasNutritionValue(){
    assertEquals(2, chicken.nutritionValue());
  }
}