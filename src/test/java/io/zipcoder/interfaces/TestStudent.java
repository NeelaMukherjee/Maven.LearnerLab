package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {

        //Given
        Student  student = new Student(10l);

        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {

        //Given
        Student  student = new Student(10l);

        //When

        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {

        //Given
        Student  student = new Student(10l);
        //double totalStudyTime = 10.0;

        //When

        student.learn(12.0);
        double actual = student.getTotalStudyTime();

                //Then
        Assert.assertEquals(12.0, actual, 0d);
    }

    @Test
    public void testLearn2() {

        //Given
        Student  student = new Student(10l);
        student.setTotalStudyTime(10.0);

        //When

        student.learn(12.0);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(22.0, actual, 0d);
    }



}
