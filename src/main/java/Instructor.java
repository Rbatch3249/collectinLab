public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfLearner = numberOfHours/learners.length;
    }
}
