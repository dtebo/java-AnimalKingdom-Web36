package animalkingdom;

import java.util.*;

public class AnimalKingdom{
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();

        //Mammals
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Racoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));

        //Birds
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));

        //Fish
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        //Sort animals in descending order by year named
        animalList.sort((a1, a2) -> (a1.getYearDiscovered() > a2.getYearDiscovered() ? -1 : 1));

        System.out.println(animalList);

        //Sort animals alphabetically
        Collections.sort(animalList, (a1, a2) -> (a1.getName().compareTo(a2.getName())));

        System.out.println(animalList);

        //Sort animals by how they move
        Collections.sort(animalList, (a1, a2) -> (a1.move().compareTo(a2.move())));
        
        System.out.println(animalList);

        //Filter by animals that breath with lungs
        printFilteredList(animalList, (a) -> a.breath() == "lungs");

        //Filter by animals that breath with lungs and were named in 1758
        printFilteredList(animalList, (a) -> a.breath() == "lungs" && a.yearDiscovered == 1758);

        //Filter by animals that lay eggs and breath with lungs
        printFilteredList(animalList, (a) -> a.reproduce() == "eggs" && a.breath() == "lungs");

        //Sort animals alphabetically
        Collections.sort(animalList, (a1, a2) -> (a1.getName().compareTo(a2.getName())));

        //Print only those animals that were sorted that were named in 1758
        printFilteredList(animalList, (a) -> a.getYearDiscovered() == 1758);

        //Print only those animals that were sorted that are mammals
        printFilteredList(animalList, (a) -> a instanceof Mammal);
    }

    public static void printFilteredList(List<Animal> animalList, AnimalTester animalTester){
        for (Animal a : animalList){
            if(animalTester.test(a)){
                System.out.println(a);
            }
        }

        System.out.println("\n");
    }
}