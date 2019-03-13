package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;
//import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    /////
    @Test
    public void testInstructorsSingleton(){
        // Given
        Instructor leon = new Instructor(30l);
        leon.setName("Leon");
        Instructor kris = new Instructor(40l);
        kris.setName("Kris");
        Instructor wil = new Instructor(20l);
        wil.setName("Wil");
        Instructor nhu = new Instructor(10l);
        nhu.setName("Nhu");

        List<Instructor> expected = new ArrayList<>();
        expected.add(nhu);
        expected.add(wil);
        expected.add(leon);
        expected.add(kris);

        // When
        People actual = Instructors.getInstance();
        boolean expectedTrue = true;

        for(int i = 0; i < actual.getCount()-1; i++){
            if(!((expected.get(i).getId() == (actual.getArray()[i].getId())) ||
                    (expected.get(i).getName().equals(actual.getArray()[i].getName())))){
                expectedTrue = false;
            }
        }

        // Then
        Assert.assertTrue(expectedTrue);
    }
}
