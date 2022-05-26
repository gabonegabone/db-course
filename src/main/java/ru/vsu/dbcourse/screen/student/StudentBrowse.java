package ru.vsu.dbcourse.screen.student;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Student;

@UiController("Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
public class StudentBrowse extends StandardLookup<Student> {
}