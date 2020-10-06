public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(double totalStudyTime) {
        super();
        this.totalStudyTime = totalStudyTime;
    }

    public Student(Long nameId, String name, double totalStudyTime) {
        super(nameId, name);
        this.totalStudyTime = totalStudyTime;

    }


    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
