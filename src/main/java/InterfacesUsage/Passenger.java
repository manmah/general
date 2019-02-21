package InterfacesUsage;

public class Passenger extends Person implements Comparable {

    private int memberLevel;
    private int memberDays;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Passenger(int memberLevel, int memberDays, String name) {
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Passenger{" +
                "memberLevel=" + memberLevel +
                ", memberDays=" + memberDays +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Passenger p = (Passenger)o;
        if(memberLevel > p.memberLevel)
            return -1;
        else if(memberLevel < p.memberLevel)
            return 1;
        else{
            if(memberDays > p.memberDays)
                return -1;
            else if(memberDays < p.memberDays)
                return 1;
            else
                return 0;
        }
    }
}
