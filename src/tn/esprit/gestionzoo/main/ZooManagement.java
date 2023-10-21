package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;


import java.util.Arrays;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {

        //Instruction 21
        Terrestrial Terrestrial=new Terrestrial();
        Dolphin dol=new Dolphin();
        Penguin pen=new Penguin();
        Zoo zoo=new Zoo();
        
        //Instruction 22
                /*
        On remarque que le constructeur par defaut n'est pas encore disponible car on est définit un constructeur parametré
        On le corige avec definition d'un constructeur non parametre
         */

  ;
  //Instruction 23

        


        Dolphin dolphin=new Dolphin("water", 1.236f);

        Penguin penguin=new Penguin("water", 120.5f);
        Penguin penguin2=new Penguin("water", 1200.5f);



        /*
        Instruction 23
         */
       
        System.out.println(dolphin);

        System.out.println(penguin);
        /*
Instruction 24
l'objet aquatic va afficher sa propre message dans sa propre fonction swim et penguin aussi va afficher
le message dans la methode swim dans aquatic car il l'herite et il n'a pas fait une redéfinition mais dolphin il fait une
rédefinition de la methode swim d'ou il affiche sa propre message dans sa propre methode
         */
       
        dolphin.swim();
        penguin.swim();
    zoo.addAquaticAnimal(penguin);
    zoo.addAquaticAnimal(dolphin);
    zoo.addAquaticAnimal(penguin2);
    System.out.println(Arrays.toString(zoo.aquaticAnimals));
    for (Aquatic animal : zoo.aquaticAnimals) {
		if (animal != null) {
			animal.swim();
		}
	}
    System.out.println(zoo.maxPenguinSwimmingDepth());
    zoo.displayNumberOfAquaticsByType();
    penguin.setAge(3);
    penguin2.setAge(3);
    penguin.setName("p");
    penguin2.setName("p");
    System.out.println(penguin+" "+penguin2+"\n");
    System.out.println( penguin.getAge()==penguin2.getAge());
    System.out.println( penguin.getName()==penguin2.getName());
    System.out.println( penguin.getHabitat()==penguin2.getHabitat());
    System.out.println(penguin.equals(penguin2));
    }
    
}

