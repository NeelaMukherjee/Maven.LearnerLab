package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void addTest() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person personToAdd = new Person(3l);
        Person[] expected = {person1, person2, personToAdd};

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);

        People people = new People(personArrayList);

        people.add(personToAdd);
        Person[] actual = people.getArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person personToRemove = new Person(3l);
        Person[] expected = {person1, person2};

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(personToRemove);

        People people = new People(personArrayList);

        people.remove(personToRemove);
        Person[] actual = people.getArray();
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void findByIdTest() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person personToFind = new Person(3l);

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(personToFind);

        People people = new People(personArrayList);
        Person actual = people.findById(3l);
        Assert.assertEquals(3l, actual.getId(), 0.0);

    }

    @Test
    public void findByIdTest2() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person personToFind = new Person(3l);

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(personToFind);

        People people = new People(personArrayList);
        Person actual = people.findById(4l);
        Assert.assertNull(actual);

    }

    @Test
    public void removeByIdTest() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person personToRemove = new Person(3l);
        Person[] expected = {person1, person2};
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(personToRemove);

        People people = new People(personArrayList);
        people.removeByID(3l);
        Person[] actual = people.getArray();
        Assert.assertArrayEquals(expected, actual);

    }
    @Test
    public void removeByIdTest2() {

        Person person1 = new Person(1l);
        Person person2 = new Person(2l);
        Person person3 = new Person(3l);
        Person[] expected = {person1, person2, person3};
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        People people = new People(personArrayList);
        people.removeByID(4l);
        Person[] actual = people.getArray();
        Assert.assertArrayEquals(expected, actual);

    }

}
