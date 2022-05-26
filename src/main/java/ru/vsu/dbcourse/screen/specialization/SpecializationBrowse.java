package ru.vsu.dbcourse.screen.specialization;

import io.jmix.ui.screen.*;
import ru.vsu.dbcourse.entity.Specialization;

@UiController("Specialization.browse")
@UiDescriptor("specialization-browse.xml")
@LookupComponent("specializationsTable")
public class SpecializationBrowse extends StandardLookup<Specialization> {
}