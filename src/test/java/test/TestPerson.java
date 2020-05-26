package test;

import com.study.d18.Person;
import org.junit.Test;

public class TestPerson {
    
    @Test
    public void test() {
        //Arrange
        Person p = new Person();
        int age = 18;
        int excepted = 18;
        //Act
        p.setAge(age);
        int act = p.getAge();
        //Assert
        assert (excepted == act) : excepted + " == " + act;
        System.out.println("Pass");
    }
    
    @Test
    public void test2() {
        //Arrange
        Person p = new Person();
        int age = 150;
        int excepted = -1;
        //Act
        p.setAge(age);
        int act = p.getAge();
        //Assert
        assert (excepted == act) : excepted + " == " + act;
        System.out.println("Pass");
    }
    
    @Test
    public void testAll() {
        test();
        test2();
    }
}
