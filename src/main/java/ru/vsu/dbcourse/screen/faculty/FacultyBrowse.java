package ru.vsu.dbcourse.screen.faculty;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Faculty;

@UiController("Faculty.browse")
@UiDescriptor("faculty-browse.xml")
@LookupComponent("facultiesTable")
public class FacultyBrowse extends StandardLookup<Faculty> {
}