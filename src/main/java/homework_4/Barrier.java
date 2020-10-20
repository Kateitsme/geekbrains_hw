package homework_4;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean action(Member member);
}
