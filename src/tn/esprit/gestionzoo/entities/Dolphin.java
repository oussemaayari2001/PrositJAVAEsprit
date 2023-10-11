package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
private float dolphinSpeed;

    public Dolphin(String habitat, float dolphinSpeed) {
        super(habitat);
        this.dolphinSpeed = dolphinSpeed;
    }

    public float getDolphinSpeed() {
        return dolphinSpeed;
    }

    public void setDolphinSpeed(float dolphinSpeed) {
        this.dolphinSpeed = dolphinSpeed;
    }

    public Dolphin() {
      super();
    }
    public void swim(){
        System.out.println("This dolphin animal is swimming.");
    }
    @Override
    public String toString() {
        return "Dolphin{" +
                "dolphinSpeed=" + dolphinSpeed +
                ", habitat='" + getHabitat() + '\'' +
                "} " ;
    }
}
