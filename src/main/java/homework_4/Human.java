package homework_4;

public class Human extends Member {
    public Human(String name, int maxRun, int maxJump, int maxSwim) {
        super(name);
        this.setMaxRun(maxRun);
        this.setMaxJump(maxJump);
        this.setMaxSwim(maxSwim);
    }
}
