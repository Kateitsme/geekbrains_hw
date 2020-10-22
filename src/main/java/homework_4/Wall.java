package homework_4;

public class Wall extends Barrier {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean access(Member member) {
        if (member.getMaxJump() > 0)
            return action(member);
        else {
            System.out.println("Участник не может прыгать");
            return false;
        }
    }

    @Override
    public boolean action(Member member) {
        boolean result = member.getMaxJump() >= height;
        System.out.printf("Участник %s %s перепрыгнул стену высотой %d%n",
                member.getName(), result ? "" : "не", height);
        return result;
    }
}
