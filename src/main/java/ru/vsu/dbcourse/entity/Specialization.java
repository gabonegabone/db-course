package ru.vsu.dbcourse.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;

@JmixEntity
@Table(name = "SPECIALIZATION", indexes = {
        @Index(name = "IDX_SPECIALIZATION_FACULTY_ID", columnList = "FACULTY_ID")
})
@Entity
public class Specialization {
    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "FACULTY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Faculty faculty;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}