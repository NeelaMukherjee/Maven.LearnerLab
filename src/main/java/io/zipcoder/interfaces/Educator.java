package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    NHU("Nhu", 10l),
    FROILAN("Froilan", 20l),
    WIL("Wil", 30l),
    LEON("Leon", 40l);



    final Instructor instructor;
    double timeWorked = 0;

    Educator(String name, long id){
        instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
