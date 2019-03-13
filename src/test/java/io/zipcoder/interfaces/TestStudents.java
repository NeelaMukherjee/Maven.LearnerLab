package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.ArrayList;
import org.junit.Assert;

public class TestStudents {
    @Test

    public void TestStudentSingleton(){

        Student student1 = new Student(1l);
        student1.setName("Neela");
        Student student2 = new Student(2l);
        student2.setName("Ajit");
        Student student3 = new Student(3l);
        student3.setName("Abhi");
        Student student4 = new Student(4l);
        student4.setName("Adrish");

        ArrayList<Student> expected = new ArrayList<Student>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);
        expected.add(student4);

        Students actual = Students.getInstance();

        boolean expectedTrue = true;

        for(int i = 0; i < actual.getCount(); i++){
            if(!((actual.getPersonList().get(i).getId() == expected.get(i).getId()) ||
                    (actual.getPersonList().get(i).getName().equals(expected.get(i).getName())))){
                expectedTrue = false;
            }
        }

        // Then
        Assert.assertTrue(expectedTrue);
    }
}
