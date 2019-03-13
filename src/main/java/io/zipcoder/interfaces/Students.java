package io.zipcoder.interfaces;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class Students extends  People<Student>{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student student1 = new Student(1l);
        student1.setName("Neela");
        Student student2 = new Student(2l);
        student2.setName("Ajit");
        Student student3 = new Student(3l);
        student3.setName("Abhi");
        Student student4 = new Student(4l);
        student4.setName("Adrish");

        add(student1);
        add(student2);
        add(student3);
        add(student4);

    }
     public static Students getInstance(){
        return INSTANCE;
     }

//    public Student[] getArray() {
//        return getPersonList().toArray(new Student[0]);
//    }

    @Override
    public Student[] getArray() {
        return getPersonList().toArray(new Student[0]);
    }


}
