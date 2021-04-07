package animalkingdom;

public abstract class Animal {
  private static int maxId = 1;
  protected int id;
  protected String name;
  protected int yearNamed;

  public Animal(String name, int yearNamed){
    id = maxId;
    maxId++;
    this.name = name;
    this.yearNamed = yearNamed;
  }
  public String eat() {
    return "eats";
  }
  public String move(){
    return "moves";
  }
  public String breathes(){
    return "breathes";
  }
  public String reproduce(){
    return "reproduces offspring";
  }

  @Override
  public String toString() {
    return "Animal {id=" + id + ", name='" + name + "', yearNamed=" + yearNamed + "}\n";
  }
}
