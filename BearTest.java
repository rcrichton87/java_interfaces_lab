import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon(); 
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }

  // @Test
  // public void bellyIsFull(){
  //   for(int i = 0; i<5; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(bear.isBellyFull(), true);
  // }

  // @Test
  // public void canNotEatSalmonWhenBellyFull(){
  //   for(int i = 0; i<10; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(5, bear.foodCount());
  // }

  // belly can't be full

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.eat(human);
    bear.sleep();
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatHuman(){
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUp(){
    bear.eat(salmon);
    Edible food = bear.throwUp();
    Salmon original = (Salmon) food; //cast the Edible back to a salmon object.  It's cant be made into a human, even though both are edible, it still knows it's a salmon
    // assertNotNull(food);
    //assertEquals("Swimming!", food.swim() );  //type Edible does not have the salmon's swim method, so this won't compile
    assertEquals("Swimming!", original.swim() ); //original is a salmon, so it can use the salmon's swim method even if edible doesn't have it
  }

  @Test
  public void throwUpChicken(){
    bear.eat(chicken);
    Edible food = bear.throwUp();
    Chicken original = (Chicken) food;
    assertEquals("Cluck", original.cluck() );
  }

  @Test
  public void bellyNutritionValue(){
    bear.eat(chicken);
    bear.eat(salmon);
    assertEquals(5, bear.totalNutrition() );
  }
}
