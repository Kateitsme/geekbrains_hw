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
    public boolean action(Member member) {
        member.Jump();
        if (getHeight() <= member.getJumpLimit())
            member.SuccessfulJump();
        else
            member.UnsuccessfulJump();
        return getHeight() <= member.getJumpLimit();
    }
}
