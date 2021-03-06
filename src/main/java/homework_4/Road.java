package homework_4;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean access(Member member) {
        if (member.getMaxRun() > 0)
            return action(member);
        else {
            System.out.println("Участник не может бегать");
            return false;
        }
    }

    @Override
    public boolean action(Member member) {
        boolean result = member.getMaxRun() >= length;
        System.out.printf("Участник %s %s пробежал дорожку длиной %d%n",
                member.getName(), result ? "" : "не", length);
        return result;
    }
}
