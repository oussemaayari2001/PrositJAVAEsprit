package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;


import java.util.Arrays;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        //Instruction 1
        /*
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);
*/
        //Instruction 2
        /*
         1/ Modifiez la variable d'environnement PATH et ajoutez le chemin du répertoire Java
         2/ Lancez l'invite de commande(cmd) et naviguer vers le chemin du fichier ZooManagement.java
         3/ Lancez l'instruction "javac ZooManagement.java"
         4/ Lancez l'instruction "java ZooManagement"
         */
/*
        System.out.println("-------------------------------------------------------------");
        //Instruction 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        //Etape optionelle
        zm1.zooName = "notMyZoo";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);
*/
       /*
       Instruction 5
        Animal lion=new Animal();
        Zoo myZoo=new Zoo();
        lion.name="lion0";
        lion.age=10;
        lion.family="Marsh Pride";
        lion.isMammal=false;
        myZoo.name="Belvidere";
        myZoo.city="Tunis";
        myZoo.animals=new Animal[25];
        */


/*
        Instruction 6 : au niveau de la methode main , il existe des erreurs au niveau de l'initialisation de les 2 objets
        animal et zoo,cad lorsque on fait un constructeur parametree l'autre qui est non parametree non fonctionne plus
 */
        /*
        Instruction 7 :on resolu le probléme precedent par la creation d'un constructeur non parametré pour les deux classe
        Animal et Zoo
         */
        Animal lion=new Animal("Marsh Pride","Lion0",10,false);
        Zoo myZoo=new Zoo("Belvidere","Tunis");

        //Instruction8
        myZoo.displayzoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*
         la principale observation ici est que System.out.println() utilise la méthode toString() par défaut pour afficher un objet
         donc les 2 instruction ont la meme resultat
         ====>pour notre cas ici on n'a pas fais la redefinition de la methode toString() d'ou il nous affiche l'adresse de l'objet mais non ses valeur
         */
        /*
        Instruction 9
        pour afficher les informations correctement avec ces deux instructions ,il faut redeinir la methode toString() de sorte qu'elle retourne  les attributs de la classe en chaine de caractére
         */
        /*
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());
        */

        myZoo.addAnimal(new Animal("Mapogo lions","Lion1",12,true));
        myZoo.addAnimal(new Animal("Mapogo lions","Lion2",12,true));



System.out.println(Arrays.toString(myZoo.getAnimals()));
/*
Instruction 10
on remarque que l'ajout de lion26 a renvoyé false car le zoo avait atteint sa capacité maximale de 25 cages.
 */

/*
Instruction 11: Il rentre toujours l'animal qui la trouvée le premier (le lion24 est ajouté 2 fois)
 */
/*
        Instruction 12:pour Ajouter un animal une seule fois (un animal est unique) dans un zoo
        il faut modifier la methode d'ajout de sorte qu'on utilise la méthode de recherche searchAnimal() que l'on deja defini
  /*
        Instruction 13 dans la classe Zoo
  */
        /*
        System.out.println(myZoo.removeAnimal(new Animal("Mapogo lions","Lion2",12,true)));
        System.out.println(Arrays.toString(myZoo.animals));
   */
        //Instruction 14
        System.out.println(myZoo.isZooFull());
        //Instruction 15
        Zoo zoo2=new Zoo("zoo2","bizerte");
        zoo2.addAnimal(new Animal("Mapogo lions","Lion3",12,true));
        zoo2.addAnimal(new Animal("Mapogo lions","Lion4",12,true));
        zoo2.addAnimal(new Animal("Mapogo lions","Lion5",12,true));
        System.out.println(Zoo.comparerZoo(myZoo,zoo2));
            //Instruction 17
        System.out.println(zoo2.addAnimal(new Animal("Mapogo lionssss","Lion5",12,true)));
            //Intruction 18 : on ajoute private pour tous les attributs du classe Animal et Zoo et
        // on generate getter and setter and set the conditions on the setter d'attribut age et attribut nom et
        // on change le constructeur parametree de classe animal pour que lorsque on creeer un objet avec le constructeur parametree
        // il soit adaptable au conditions
        zoo2.addAnimal(new Animal("Mapogo lions","Lion6",-1,true));
        zoo2.addAnimal(new Animal("abc family","",12,true));
        System.out.println(Arrays.toString(zoo2.getAnimals()));
        //Instruction 19 on creer les deux package
    }
}

