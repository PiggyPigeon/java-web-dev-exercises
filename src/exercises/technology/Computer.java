package exercises.technology;

public class Computer extends AbstractEntity {
    private String deviceType = "electronic";
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public String getDeviceType() {
        return deviceType;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public Computer(int storage, int ram, boolean hasKeyboard){
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public static void keyboard() {
        System.out.println("type type type");
    }
    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }
    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }
    }
