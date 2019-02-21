package inheritance;

public final class Father extends Human {

    private String fName;

    public Father(String fName) {
        super(fName);
    }

    @Override
    public String getName() {
        return fName;
    }
}
