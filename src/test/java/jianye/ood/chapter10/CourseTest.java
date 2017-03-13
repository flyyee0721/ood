package jianye.ood.chapter10;

import org.testng.Assert;
import java.util.List;

/**
 * Created by jianye on 3/12/17.
 */
public class CourseTest {

    public Course course;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        course = new Course("Math", 50);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testAddStudent() throws Exception {
        course.addStudent("Daniel Yin");
        Assert.assertEquals(1, course.getNumberOfStudents());
        List<Student> students = course.getStudents();
        Assert.assertEquals("Daniel Yin", students.get(0).getName());
        Assert.assertEquals(-1, students.get(0).getAge());
    }

    @org.testng.annotations.Test
    public void testDropStudent() throws Exception {
        course.addStudent("Daniel Yin");
        course.addStudent("Jasmine Cao");
        course.addStudent("Baby Daniel");
        Assert.assertEquals(3, course.getNumberOfStudents());
        Assert.assertFalse(course.dropStudent("Nonregistered student"));
        Assert.assertEquals(3, course.getNumberOfStudents());
        Assert.assertTrue(course.dropStudent("Daniel Yin"));
        Assert.assertEquals(2, course.getNumberOfStudents());
    }

    @org.testng.annotations.Test
    public void testGetCourseName() throws Exception {
        Assert.assertEquals("Math", course.getCourseName());
    }

    @org.testng.annotations.Test
    public void testSetCourseName() throws Exception {
        course.setCourseName("Physics");
        Assert.assertEquals("Physics", course.getCourseName());
    }

    @org.testng.annotations.Test
    public void testGetStudents() throws Exception {
        course.addStudent("Daniel Yin");
        course.addStudent("Jasmine Cao");
        course.addStudent("Baby Daniel");
        List<Student> students = course.getStudents();
        Assert.assertEquals(3, students.size());
        Assert.assertEquals("Daniel Yin", students.get(0).getName());
        Assert.assertEquals("Jasmine Cao", students.get(1).getName());
        Assert.assertEquals("Baby Daniel", students.get(2).getName());
    }

    @org.testng.annotations.Test
    public void testGetNumberOfStudents() throws Exception {
        Assert.assertEquals(0, course.getNumberOfStudents());
        course.addStudent("Baby Daniel");
        Assert.assertEquals("Baby Daniel", course.getStudents().get(0).getName());
        Assert.assertEquals(1, course.getNumberOfStudents());
    }

    @org.testng.annotations.Test
    public void testToString() throws Exception {
        course.addStudent("Daniel Yin");
        course.addStudent("Jasmine Cao");
        course.addStudent("Baby Daniel");
    }

    @org.testng.annotations.Test(expectedExceptions = RuntimeException.class)
    public void testExceedCapacity() throws Exception {
        course = new Course("Math", 2);
        course.addStudent("Daniel Yin");
        course.addStudent("Jasmine Cao");
        Assert.assertEquals(2, course.getNumberOfStudents());
        course.addStudent("Baby Daniel");
    }

}