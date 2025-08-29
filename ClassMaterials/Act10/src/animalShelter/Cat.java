package animalShelter;

/**
 * Class representing a cat in the animal shelter. 
 * 
 * @author Ian Ludden (luddenig)
 */
public class Cat extends Animal {

    private boolean isLitterBoxTrained;

    public Cat(int id, String name, int birthYear, int birthMonth, boolean isLitterBoxTrained) {
        super(id, name, birthYear, birthMonth);
        this.isLitterBoxTrained = isLitterBoxTrained;
    }

    public boolean isLitterBoxTrained() {
        return isLitterBoxTrained;
    }

    public void setLitterBoxTrained(boolean isLitterBoxTrained) {
        this.isLitterBoxTrained = isLitterBoxTrained;
    }

    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public String toString() {
        String litterBoxInfo = this.isLitterBoxTrained ? "IS litter box trained" : "is NOT litter box trained";
        return super.toString() + ", " + litterBoxInfo;
    }
    
}
