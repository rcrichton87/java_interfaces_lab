// array lists can't take primitive types, so they can't take ints.  They can take Integers though

import java.util.*; // needs to be imported to use array lists

public class Bear{
  
  private String name;
  private ArrayList<Edible> belly; // put the type in <>  using the interface means human and salmon will fit

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();  //need () when creating a new array list
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return belly.size(); //array list can have any size, so just count what's in the array list
  }

  // public void eat(Salmon salmon){
  //   bellySalmon.add(salmon);  // adds to the array list
  // }

  // public void eat(Human human){ //overloading, can have method with the same name, different types
  //   bellyHuman.add(human);
  // }

  // ^ without implementing edible, need seperate methods and bellies to eat different objects

  public void eat(Edible food){ // will take a salmon or human
    belly.add(food);
  }

 // public boolean isBellyFull(){
 //   return foodCount() == belly.length;
 // }

 // ^ belly can't be full since it's an array list

  public void sleep(){
    belly.clear();  //empties the array list.  array lists have many methods
  }

  public Edible throwUp(){
    if (foodCount() > 0 ) { // make sure the belly has something in it
      return belly.remove(foodCount() - 1); //remove returns the thing removed from the array, removing last thing added, remove takes an index
    }
    return null;
  }

}
