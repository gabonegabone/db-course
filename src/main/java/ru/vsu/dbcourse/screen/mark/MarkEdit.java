package ru.vsu.dbcourse.screen.mark;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Mark;

@UiController("Mark.edit")
@UiDescriptor("mark-edit.xml")
@EditedEntityContainer("markDc")
public class MarkEdit extends StandardEditor<Mark> {
}