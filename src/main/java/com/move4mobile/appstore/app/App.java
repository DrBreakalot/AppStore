package com.move4mobile.appstore.app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.move4mobile.appstore.Project;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class App {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "app")
    private List<Version> versions;

    @ManyToMany
    @JsonIgnore
    private Project project;

    App() {}

    public App(String name, List<Version> versions, Project project) {
        this.name = name;
        this.versions = versions;
        this.project = project;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public Project getProject() {
        return project;
    }
}
