package ru.vsu.dbcourse.screen.specialization;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Specialization;

@UiController("Specialization.edit")
@UiDescriptor("specialization-edit.xml")
@EditedEntityContainer("specializationDc")
public class SpecializationEdit extends StandardEditor<Specialization> {
}