package homework_4;

public class Robot extends Member {
    public Robot(String name, int maxRun, int maxJump, int maxSwim, int maxFly) {
        super(name);
        this.setMaxRun(maxRun);
        this.setMaxJump(maxJump);
        this.setMaxSwim(maxSwim);
        this.setMaxFly(maxFly);
    }
}
