package homework_4;

public class Chasm extends Barrier {
    private int length;

    public Chasm(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean access(Member member) {
        if (member.getMaxFly() > 0)
            return action(member);
        else {
            System.out.println("Участник не может летать");
            return false;
        }
    }

    @Override
    public boolean action(Member member) {
        boolean result = member.getMaxFly() >= length;
        System.out.printf("Участник %s %s перелетел пропасть шириной %d%n",
                member.getName(), result ? "" : "не", length);
        return result;
    }
}
