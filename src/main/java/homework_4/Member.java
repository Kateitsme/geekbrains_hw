package homework_4;

public abstract class Member {
    private String name;
    private int maxRun;
    private int maxJump;
    private int maxSwim;
    private int maxFly;

    public Member(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public int getMaxFly() {
        return maxFly;
    }

    public void setMaxFly(int maxFly) {
        this.maxFly = maxFly;
    }

}
