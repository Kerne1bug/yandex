import java.util.ArrayList;

public class Praktikum {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();
        ArrayList<Integer> order = new ArrayList<Integer>();
        order.add(1);
        order.add(4);
        order.add(0);
        order.add(2);
        order.add(3);
        animals.add("шиншила");
        animals.add("крокодил");
        animals.add("лев");
        animals.add("медведь");
        animals.add("слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:");
        System.out.println("Это будут: ");
        for (String animal : animals) {
            System.out.println(animal);
        }

        int time = 9;
        System.out.println("Расписание кормлений:");
        for (Integer number : order) {
            System.out.println("В " + time + ":00 - " + animals.get(number));
            time++;
        }
    }
}
