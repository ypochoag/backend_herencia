
package Entidad;


public class Gato extends Animal {
    
    public Gato(String name, String food, int age, String animalBreed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.animalBreed = animalBreed;
    }      
    
    
    @Override
    public void feed(){
        System.out.println(food);
    }
    
}
