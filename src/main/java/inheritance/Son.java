package inheritance;

public class Son extends Human {
    private String sName;

    public Son(String sName) {
        super(sName);
    }

    @Override
    public String getName() {
        return sName;
    }
}
