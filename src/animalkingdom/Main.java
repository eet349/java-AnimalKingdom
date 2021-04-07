package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    List<Animal> animalList = new ArrayList<Animal>();

    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);


    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);

    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    System.out.println("*** MVP ***");
    System.out.println("\n*** List all the animals in descending order by year named ***");
    animalList.sort( (a1, a2) -> a1.yearNamed < a2.yearNamed ? 1 : -1 );
    System.out.println(animalList);

    System.out.println("\n*** List all the animals alphabetically ***");
    animalList.sort( (a1, a2) -> a1.name.compareTo(a2.name) );
    System.out.println(animalList);

    System.out.println("\n*** List all the animals order by how they move ***");
    animalList.sort( (a1, a2) -> a1.move().compareTo(a2.move()) );
    System.out.println(animalList);

    System.out.println("\n*** List only those animals the breath with lungs ***");
    printSortedAnimals(animalList, (a) -> a.breathes() == "lungs");

    System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
    printSortedAnimals(animalList, (a) -> a.breathes() == "lungs" && a.yearNamed == 1758);

    System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
    printSortedAnimals(animalList, (a) -> a.reproduce() == "eggs" && a.breathes() == "lungs");

    System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
    animalList.sort( (a1, a2) -> a1.name.compareTo(a2.name) );
    printSortedAnimals(animalList, (a) -> a.yearNamed == 1758);


    System.out.println("\n*** Stretch Goal ***");
    System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
    animalList.sort( (a1, a2) -> a1.name.compareTo(a2.name) );
    printSortedAnimals(animalList, (a) -> a instanceof Mammal);

  }

  public static void printSortedAnimals(List<Animal> animalList, AnimalSorter animalTester){
    for(Animal a : animalList) {
      if(animalTester.test(a)) {
        System.out.println(a.name + " " + a.reproduce() + " " + a.move() + " " + a.breathes() + " " + a.yearNamed);
      }
    }
  }
}