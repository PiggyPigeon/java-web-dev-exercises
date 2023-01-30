package exercises.technology;

public class Smartphone extends Computer {
    private int numberOfSelfies;

    public Smartphone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfies(int number) {
        this.numberOfSelfies = this.numberOfSelfies + number;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
