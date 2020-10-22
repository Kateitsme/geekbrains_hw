package homework_4;

public class Member {
    private String type;
    private String name;
    private int runLimit;
    private int jumpLimit;

    public Member(String type, String name, int runLimit, int jumpLimit) {
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }
    public void Run(){
        System.out.println("Участник бежит.");
    }
    public void Jump(){
        System.out.println("Участник прыгает.");
    }
    public void SuccessfulRun(){
        System.out.println(this.type + this.name +  "успешно пробежал.");
    }
    public void SuccessfulJump(){
        System.out.println(this.type + this.name +  "успешно прошел препятствия.");
    }
    public void UnsuccessfulRun(){
        System.out.println(this.type + this.name +  "не смог пробежать.");
    }
    public void UnsuccessfulJump(){
        System.out.println(this.type + this.name +  "не смог преодолеть препятствия.");
    }

}
