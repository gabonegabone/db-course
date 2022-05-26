package ru.vsu.dbcourse.screen.faculty;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Faculty;

@UiController("Faculty.edit")
@UiDescriptor("faculty-edit.xml")
@EditedEntityContainer("facultyDc")
public class FacultyEdit extends StandardEditor<Faculty> {
}