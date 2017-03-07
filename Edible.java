public interface Edible{  //can use an interface to group things
  //public String swim(); //each class referencing edible MUST have a swim method to do this, if human can't swim, this won't compile

  public int nutritionValue();

}

//edible is like a blanket covering other objects, they still keep their human or salmon type, edible can be removed