package NestedAndInnerClasses;

public class Passenger extends Person  {

    private int memberLevel;
    private int memberDays;
    private String name;
    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    public static class RewardProgram{
        private int memberLevel;
        private int memberDays;

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    public Passenger(int memberLevel, int memberDays, String name) {
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "memberLevel=" + memberLevel +
                ", memberDays=" + memberDays +
                '}';
    }


}
