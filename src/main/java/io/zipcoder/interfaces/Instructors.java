package io.zipcoder.interfaces;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {

        Instructor instructor1 = new Instructor(10l);
        instructor1.setName("Nhu");
        Instructor instructor2 = new Instructor(20l);
        instructor2.setName("Wil");
        Instructor instructor3 = new Instructor(30l);
        instructor3.setName("Leon");
        Instructor instructor4 = new Instructor(40l);
        instructor4.setName("Kris");

        add(instructor1);
        add(instructor2);
        add(instructor3);
        add(instructor4);

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

//    public Instructor[] getArray() {
//        return getPersonList().toArray(new Instructor[0]);
//    }

    @Override
    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);


    }
}