/*
Clase Padre
 */
package Entidad;

public class Animal {
   protected String name;
   protected String food;
   protected int age;
   protected String animalBreed;

    public Animal() {
    }

    public Animal(String name, String food, int age, String animalBreed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.animalBreed = animalBreed;
    }
    
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public void feed() {   
        System.out.println("");
    }
 
}
