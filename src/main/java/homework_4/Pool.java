package homework_4;

public class Pool extends Barrier {
    private int length;

    public Pool(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean access(Member member) {
        if (member.getMaxSwim() > 0)
            return action(member);
        else {
            System.out.println("Участник не может плавать");
            return false;
        }
    }

    @Override
    public boolean action(Member member) {
        boolean result = member.getMaxSwim() >= length;
        System.out.printf("Участник %s %s переплыл бассейн длиной %d%n",
                member.getName(), result ? "" : "не", length);
        return result;
    }
}
