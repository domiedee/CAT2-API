package com.example.cat.model;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "unit_name")
    private String unitName;

    public Unit(String unitName, String unitDescription, Unit unit) {
        this.unitName = unitName;
        this.unitDescription = unitDescription;
        this.unit = unit;
    }

    @Column(name = "course_description")
    private String unitDescription;


    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;

    private Unit(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitDescription() {
        return unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Unit{" + "id=" + id + ", unitName='" +
                unitName + ",unitDescription=" +
                unitDescription + '\'' + '}';
    }
}
