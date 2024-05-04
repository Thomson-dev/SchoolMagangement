public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void payFees(int fees) {
        feesPaid += fees;
    }

    public int getFeesPaid() {
        return feesPaid;
    }
    public int getTotalFee(){
        return feesTotal;
    }

    public int remainingbalance(){
        return feesTotal - feesPaid;
    }

    public int getGrade() {
        return grade;
    }
}
