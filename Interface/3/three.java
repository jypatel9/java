interface member {
    void callback();
}

class shop {
    member mem[] = new member[10];
    int count = 0;

    public void register(member m) {
        mem[count++] = m;
    }

    public void invites() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class customer implements member {
    String name;

    public customer(String n) {
        this.name = n;
    }

    public void callback() {
        System.out.println("I'm Coming to sale " + name);
    }
}

public class three {
    public static void main(String args[]) {
        shop s = new shop();
        customer c1 = new customer("Jay Desai");
        customer c2 = new customer("Hello world");
        s.register(c1);
        s.register(c2);
        s.invites();
    }
}