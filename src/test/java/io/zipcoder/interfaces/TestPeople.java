package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    Student Kate;

    @Before
    public void setUp() {
        Kate = new Student(5l);
        Kate.setName("Kate");
    }

    @Test
    public void testAdd() {
        List<Student> expected = new ArrayList<>();
        Students students = Students.getInstance();
        for (Student student : students.getPersonList()) {
            expected.add(student);
        }
        expected.add(Kate);

        // When
        students.add(Kate);
        List<Student> actual = students.getPersonList();

        // Then
        Assert.assertEquals(expected, actual);
        students.remove(Kate);

    }

    @Test
    public void testRemoveByPerson() {
        // Given
        List<Student> expected = new ArrayList<>();
        Students people = Students.getInstance();
        for (Student student : people.getPersonList()) {
            expected.add(student);
        }
        Student Adrish = expected.get(3);
        expected.remove(Adrish);

        // When
        people.remove(Adrish);
        List<Student> actual = people.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        people.add(Adrish);
    }


    @Test
    public void testRemoveById() {
        // Given
        List<Student> expected = new ArrayList<>();
        Students students = Students.getInstance();
        for (Student student : students.getPersonList()) {
            expected.add(student);
        }
        Student Adrish = expected.get(3);
        expected.remove(Adrish);

        // When
        students.remove(Adrish);
        List<Student> actual = students.getPersonList();

        //Then
        Assert.assertEquals(expected, actual);
        students.add(Adrish);
    }


    @Test
    public void testFindByIdInstructor() {
        // Given
        Instructors people = Instructors.getInstance();
        Person expected = people.getPersonList().get(3);

        // When
        Person actual = people.findById(40l);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFindByIdStudent() {
        // Given
        Students people = Students.getInstance();
        Person expected = people.getPersonList().get(3);

        // When
        Person actual = people.findById(4l);

        // Then
        Assert.assertEquals(expected, actual);

    }
}


//    @Test
//    public void addTest() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        //Person personToAdd = new Person(3l);
//        Person[] expected = {person1, person2, personToAdd};
//
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        Students people = Students.getInstance();
//
//        //People people = new People(personArrayList);
//
//        people.add(Neela);
//        Person[] actual = people.getArray();
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void removeTest() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        Person personToRemove = new Person(3l);
//        Person[] expected = {person1, person2};
//
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        personArrayList.add(personToRemove);
//
//        People people = new People(personArrayList);
//
//        people.remove(personToRemove);
//        Person[] actual = people.getArray();
//        Assert.assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void findByIdTest() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        Person personToFind = new Person(3l);
//
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        personArrayList.add(personToFind);
//
//        People people = new People(personArrayList);
//        Person actual = people.findById(3l);
//        Assert.assertEquals(3l, actual.getId(), 0.0);
//
//    }
//
//    @Test
//    public void findByIdTest2() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        Person personToFind = new Person(3l);
//
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        personArrayList.add(personToFind);
//
//        People people = new People(personArrayList);
//        Person actual = people.findById(4l);
//        Assert.assertNull(actual);
//
//    }
//
//    @Test
//    public void removeByIdTest() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        Person personToRemove = new Person(3l);
//        Person[] expected = {person1, person2};
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        personArrayList.add(personToRemove);
//
//        People people = new People(personArrayList);
//        people.removeByID(3l);
//        Person[] actual = people.getArray();
//        Assert.assertArrayEquals(expected, actual);
//
//    }
//    @Test
//    public void removeByIdTest2() {
//
//        Person person1 = new Person(1l);
//        Person person2 = new Person(2l);
//        Person person3 = new Person(3l);
//        Person[] expected = {person1, person2, person3};
//        ArrayList<Person> personArrayList = new ArrayList<Person>();
//        personArrayList.add(person1);
//        personArrayList.add(person2);
//        personArrayList.add(person3);
//
//        People people = new People(personArrayList);
//        people.removeByID(4l);
//        Person[] actual = people.getArray();
//        Assert.assertArrayEquals(expected, actual);
//
//    }



