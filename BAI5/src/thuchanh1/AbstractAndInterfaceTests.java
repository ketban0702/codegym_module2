package thuchanh1;

import thuchanh1.animal.Animal;
import thuchanh1.animal.Chicken;
import thuchanh1.animal.Tiger;
import thuchanh1.fruit.Apple;
import thuchanh1.fruit.Fruit;
import thuchanh1.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}


