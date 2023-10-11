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
        Aquatic aq =new Aquatic();
        Penguin pen=new Penguin();
        //Instruction 22
                /*
        On remarque que le constructeur par defaut n'est pas encore disponible car on est définit un constructeur parametré
        On le corige avec definition d'un constructeur non parametre
         */

  ;
  //Instruction 23

        Aquatic aquatic =new Aquatic("water");


        Dolphin dolphin=new Dolphin(aquatic.getHabitat(), 1.236f);

        Penguin penguin=new Penguin(aquatic.getHabitat(), 120.5f);




        /*
        Instruction 23
         */
        System.out.println(aquatic);
        System.out.println(dolphin);

        System.out.println(penguin);
        /*
Instruction 24
l'objet aquatic va afficher sa propre message dans sa propre fonction swim et penguin aussi va afficher
le message dans la methode swim dans aquatic car il l'herite et il n'a pas fait une redéfinition mais dolphin il fait une
rédefinition de la methode swim d'ou il affiche sa propre message dans sa propre methode
         */
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}

