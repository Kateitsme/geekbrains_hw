package homework_4;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        Member[] members = new Member[3];

        int jump = rand.nextInt(10);
        int run = rand.nextInt(10);
        members[0]=new Human("Человек ", "Сережа ",run,jump);

        jump = rand.nextInt(10);
        run = rand.nextInt(10);
        members[1]=new Robot("Робот ", "CX412 ",run,jump);

        jump = rand.nextInt(10);
        run = rand.nextInt(10);
        members[2]=new Cat("Кот ", "Сёма ",run,jump);

        Barrier[] barriers = new Barrier[6];
        int [] arr = {0,1,1,0,0,1};
        for (int i = 0; i < barriers.length; i++) {
            int value = rand.nextInt(10);
            if (arr[i]==1) {
                barriers[i] = new Road("Road " + i, value);
            } else {
                barriers[i] = new Wall("Wall " + i, value);
            }
        }
        for (Member member : members) {
            boolean result = true;
            for (Barrier barrier : barriers) {
                result = barrier.action(member);
                if (!result)
                    break;
            }
            if (!result) {
                System.out.println("Неуспешно!!");
            } else {
                System.out.println("Успешно!!");
            }
        }
    }
}
