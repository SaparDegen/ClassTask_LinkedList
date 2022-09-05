import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Animal> linkedList = new LinkedList<>();
        int c = 1;
        for (int i = 0; i < 50; i++) {
            linkedList.add(new Cat("Cat" + c, random.nextInt(1, 10)));
            linkedList.add(new Dog("Dog" + c, random.nextInt(1, 15)));
            c++;
        }
        System.out.println(linkedList);

        int countCat = 0, countDog = 0, c1 = 1;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getClass().getSimpleName().equals("Cat")) {
                countCat++;
                if (countCat == 5) {
                    linkedList.remove(i);
                    countCat = 0;
                }
            } else if (linkedList.get(i).getClass().getSimpleName().equals("Dog")) {
                countDog++;
                if (countDog == 3) {
                    linkedList.add(i + 1, new Mouse("Mouse" + c1, random.nextInt(1,5)));
                    c1++;
                    countDog = 0;
                }
            }
        }
        System.out.println(linkedList);

    }
}