package homework_4;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        Member[] members = new Member[5];

        int jump = rand.nextInt(10);
        int run = rand.nextInt(10);
        int swim = rand.nextInt(10);
        members[0]=new Human("Сережа ",run,jump,swim);
        jump = rand.nextInt(10);
        run = rand.nextInt(10);
        int fly = rand.nextInt(10);
        swim = rand.nextInt(10);
        members[1]=new Robot("CX412 ",run,jump,swim,fly);

        jump = rand.nextInt(10);
        run = rand.nextInt(10);
        members[2]=new Cat("Сёма ",run,jump);

        fly = rand.nextInt(10);
        members[3]=new Bird("Соловей",fly);

        swim = rand.nextInt(10);
        members[4]=new Fish("Осётр",swim);

        Barrier[] barriers = new Barrier[4];
        int value = rand.nextInt(10);
        barriers[0]= new Wall("Стена",value);
        value = rand.nextInt(10);
        barriers[1]= new Road("Дорожка",value);
        value = rand.nextInt(10);
        barriers[2]= new Pool("Бассейн",value);
        value = rand.nextInt(10);
        barriers[3]= new Chasm("Пропасть",value);

        for (Member member : members) {
            boolean result = true;
            for (Barrier barrier : barriers) {
                result = barrier.access(member);
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
