package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class People {

    ArrayList<Person> personList = new ArrayList<Person>();

    public People(ArrayList<Person> personList) {

        this.personList = personList;
    }

    public void add(Person person) {

        personList.add(person);
    }

    public Person findById(long id) {

        Person[] person = getArray();
        for (Person p : person) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void remove(Person person) {

        personList.remove(person);
    }

    public void removeByID(long id) {

        Person p = findById(id);
        personList.remove(p);

    }

    public Integer getCount() {

        return personList.size();
    }

    public Person[] getArray() {

        return personList.toArray(new Person[personList.size()]);

    }

    public void removeAll() {
        personList.clear();
    }
}