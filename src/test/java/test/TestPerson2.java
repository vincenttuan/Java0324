package test;

import com.study.d18.Person;
import org.junit.Test;

public class TestPerson2 {
    
    @Test
    public void test() {
        //Arrange
        Person p = new Person();
        int age = 120;
        int excepted = -1;
        //Act
        p.setAge(age);
        int act = p.getAge();
        //Assert
        assert (excepted == act) : excepted + " == " + act;
        System.out.println("Pass");
    }
}
