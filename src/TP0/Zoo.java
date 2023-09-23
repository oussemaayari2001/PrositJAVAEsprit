package TP0;

import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayzoo(){
        System.out.println(
                "name : "+this.name+" , "+"city :"+this.city+" ,nbrCages= "+nbrCages

        );
    }

  /*
    boolean addAnimal(Animal animal){
        for (int i = 0; i < this.nbrCages; i++) {
            if (this.animals[i] == null) {
                this.animals[i]=animal;
                return true;
            }
        }
        return  false;
    }


   */
  boolean addAnimal(Animal animal){
      if (searchAnimal(animal) == -1) {
          for (int i = 0; i < this.nbrCages; i++) {
              if (this.animals[i] == null) {
                  this.animals[i]=animal;
                  return true;
              }
          }
      }

      return  false;
  }
    void displayAnimals(){
        for (int i = 0; i < this.nbrCages; i++) {
            if (this.animals[i] == null) {

                break;
            }
            else System.out.println(this.animals[i]);
            }
        }

    int searchAnimal(Animal animal){
        for (int i = 0; i <this.nbrCages ; i++) {
            if (animals[i]!=null && animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
        int animalIndex = searchAnimal(animal);

        if (animalIndex != -1) {

            for (int i = animalIndex; i < nbrCages - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrCages - 1] = null;
            nbrCages--;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Zoo{" +

                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
