package by.epam.learn.action;

import by.epam.learn.entity.BaseCourse;
import by.epam.learn.entity.Course;
import by.epam.learn.entity.OptionalCourse;

public class CourseAction {
    public void doAction(Course course) {
        if (course instanceof BaseCourse base) {
            // for BaseCourse and FreeCourse
            base.method();
        } else if (course instanceof OptionalCourse optional) {
            // for OptionalCourse
            optional.method();
        } else if (course == null) {
            // for Course or null
            System.out.println("null");
        } else {
            course.method();
        }
    }
}
