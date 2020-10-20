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

    @Override
    public boolean action(Member member) {
        member.Run();
        if (getLength() <= member.getRunLimit())
            member.SuccessfulRun();
        else
            member.UnsuccessfulRun();
        return getLength() <= member.getRunLimit();
    }
}
