class coffemachine {
    private float milkqty;
    private float waterqty;

    static private coffemachine our = null;

    private coffemachine() {
        milkqty = 1;
        waterqty = 1;
    }

    static public coffemachine getinstace() {
        if (our == null) {
            our = new coffemachine();
        }
        return our;
    }

    public void display() {
        System.out.println("Hello.");
    }
}

public class first {
    public static void main(String argsp[]) {
        coffemachine c = coffemachine.getinstace();
        c.display();
    }
}
