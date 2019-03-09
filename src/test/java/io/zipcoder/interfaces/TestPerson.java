package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void PersonConstructorTest() {

        //Given
        Person person = new Person(1l);

        //When
        long actual = person.getId();

        //Then
        Assert.assertEquals(1l, actual);
    }

    @Test
    public void SetNameTest() {

        //Given
        Person person = new Person(1l);
        String name = "Neela";

        //When
        person.setName(name);
        String actual = person.getName();

        //Then

        Assert.assertEquals(name, actual);
    }


}
