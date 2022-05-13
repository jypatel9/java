import java.util.ArrayList;
import java.util.List;

public class first {
    
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,4);

        al1.addAll(1,al2);
        al1.set(2, 99);
        System.out.println(al1);
        System.out.println(al1.contains(55));
        System.out.println(al1.indexOf(90));

        for(Integer x:al1){
            System.out.println(x);
        }

    }

}
