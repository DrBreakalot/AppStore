package com.move4mobile.appstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private List<Project> projects;

    Company() {}

    public Company(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
