package by.epam.learn.main;

import by.epam.learn.action.CourseAction;
import by.epam.learn.entity.BaseCourse;
import by.epam.learn.entity.Course;
import by.epam.learn.entity.FreeCourse;
import by.epam.learn.entity.OptionalCourse;

public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course();
        CourseAction ca = new CourseAction();
        Course baseCourse = new BaseCourse();
        Course optional = new OptionalCourse();
        ca.doAction(baseCourse);
        ca.doAction(optional);
        Course free = new FreeCourse();
        ca.doAction(free);
    }
}
