import  java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> box=new LinkedList<>();
        box.add("xbox");
        box.add("xbox");
        box.add("ps5");
        box.add("ps2");
        box.add("xbox");
        box.add("ps4");
        box.add("nintendo");
        box.add("pegazus");
        box.add("ps2");
        box.add("ps1");
        System.out.println(box);
        int calculator=0;
        for (int i=0; i< box.size(); i++){
            if (box.get(i)=="xbox") {
                calculator++;
            }
        }
        System.out.println(calculator);


        ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=0; i<=40; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        for (int i=0; i< numbers.size(); i++){
            if (numbers.get(i)>=23 && numbers.get(i)<=36) {
                System.out.print(i);
            }
        }




    }
}