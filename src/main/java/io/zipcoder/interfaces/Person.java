package io.zipcoder.interfaces;

public class Person {

    private final long id;
    String name;

    public Person(long id){

        this.id = id;
    }

//    public Person(){
//
//    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ///////////
//    private final long id;
//    private String name;
//
//    public Person(long id){
//        this.id = id;
//    }
//
//    public long getId(){
//        return id;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return name;
//    }



}
