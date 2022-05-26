package ru.vsu.dbcourse.screen.mark;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Mark;

@UiController("Mark.browse")
@UiDescriptor("mark-browse.xml")
@LookupComponent("marksTable")
public class MarkBrowse extends StandardLookup<Mark> {
}