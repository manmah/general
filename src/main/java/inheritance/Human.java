package inheritance;

public abstract class Human {
    private String hName;

    public Human(String name) {
        this.hName = name;
    }

    public abstract String getName();

    public void setName(String name) {
        this.hName = name;
    }


}
