package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test

    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(10l);

        //When
        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }


    @Test

    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(10l);
        //When
        //Then
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach() {

        //Given
        Instructor instructor = new Instructor(10l);
        Student student = new Student(1l);
        //When

        instructor.teach(student, 10.0);
        double actual = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(10.0, actual, 0.0);

    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(10l);
        Student student1 = new Student(1l);
        Student student2 = new Student(2l);
        Student student3 = new Student(3l);

        Student [] students = {student1, student2,student3};
        //When

        instructor.lecture(students, 9.0);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();
        double actual3 = student3.getTotalStudyTime();


        //Then
        Assert.assertEquals(3.0, actual1, 0.0);
        Assert.assertEquals(3.0, actual2, 0.0);
        Assert.assertEquals(3.0, actual3, 0.0);

    }

    /////@Test
    //    public void testLecture(){
    //        // Given
    //        Instructor instructor = new Instructor(1234567);
    //        Student student1 = new Student(1);
    //        Student student2 = new Student(2);
    //        Student student3 = new Student(3);
    //        Student[] studentsExpected = new Student[3];
    //        studentsExpected[0] = student1;
    //        studentsExpected[1] = student2;
    //        studentsExpected[2] = student3;
    //
    //        for(int i = 0; i < 3; i++){
    //            studentsExpected[i].learn(5);
    //        }
    //
    //        // When
    //        Student[] studentsActual = new Student[3];
    //        studentsActual[0] = student1;
    //        studentsActual[1] = student2;
    //        studentsActual[2] = student3;
    //
    //        instructor.lecture(studentsActual, 15);
    //
    //        // Then
    //        Assert.assertArrayEquals(studentsExpected, studentsActual); }


}
