
package Entidad;

public class Perro extends Animal {

    
    public Perro(String name, String food, int age, String animalBreed) {
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
