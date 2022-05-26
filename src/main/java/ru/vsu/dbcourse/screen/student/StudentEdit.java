package ru.vsu.dbcourse.screen.student;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Student;

@UiController("Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
public class StudentEdit extends StandardEditor<Student> {
}