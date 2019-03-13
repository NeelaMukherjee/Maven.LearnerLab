package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class People<E extends Person> {

    // ArrayList<Person> personList = new ArrayList<Person>();

    ArrayList<E> personList = new ArrayList<E>();

//    public People(ArrayList<Person> personList) {
//
//        this.personList = personList;
//    }

    public void add(E person) {

        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

//    public Person findById(long id) {
//
//        Person[] person = getArray();
//        for (Person p : person) {
//            if (p.getId() == id) {
//                return p;
//            }
//        }
//        return null;
//    }

    public void remove(E person) {

        personList.remove(person);
    }

    public void removeByID(long id) {

        Person p = findById(id);
        personList.remove(p);

    }

    public Integer getCount() {

        return personList.size();
    }

//    public Person[] getArray() {
//
//        return personList.toArray(new Person[personList.size()]);
//
//    }

    public void removeAll() {
        personList.clear();
    }

    public ArrayList<E> getPersonList() {
        return personList;
    }

    public abstract E[] getArray();

}


/////////

//    private List<E> personList = new ArrayList<>();
//
//
//    public void add(E person) {
//        personList.add(person);
//    }
//
//
//    public E findById(long id) {
//        for (E person : personList) {
//            if (person.getId() == id) {
//                return person;
//            }
//        }
//        return null;
//    }
//
//
//    public void remove(Person person) {
//        personList.remove(person);
//    }
//
//
//    public void remove(long id) {
//        personList.remove(findById(id));
//    }
//
//
//    public int getCount() {
//        return personList.size();
//    }
//
//
//    public abstract E[] getArray();
//
//
//    public void removeAll() {
//        personList.clear();
//    }
//
//    public List<E> getPersonList() {
//        return personList;
//    }

