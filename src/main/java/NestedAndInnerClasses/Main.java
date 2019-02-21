package NestedAndInnerClasses;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger(3, 20, "man1");
        Passenger p2 = new Passenger(3, 50, "man2");
        Passenger p3 = new Passenger(2, 60, "man3");
        Passenger p4 = new Passenger(1, 30, "man4");

        p1.getRewardProgram().setMemberDays(100);
        p1.getRewardProgram().setMemberLevel(2);

        p2.getRewardProgram().setMemberLevel(1);

        Passenger.RewardProgram GoldenMember = new Passenger.RewardProgram();
        GoldenMember.setMemberLevel(3);
        GoldenMember.setMemberDays(100);

        if(p1.getRewardProgram().getMemberLevel() == GoldenMember.getMemberLevel())
            System.out.println("GoldenMember");

        System.out.println(p1.getRewardProgram().getMemberLevel());
        System.out.println(GoldenMember.getMemberLevel());
        System.out.println(p2.getRewardProgram().getMemberLevel() );



    }


}
