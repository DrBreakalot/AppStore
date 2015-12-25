package com.move4mobile.appstore;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.move4mobile.appstore.app.App;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "project")
    private List<App> apps;

    @ManyToOne
    @JsonIgnore
    private Company company;

    Project() {}

    public Project(String name, List<App> apps, Company company) {
        this.name = name;
        this.apps = apps;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<App> getApps() {
        return apps;
    }

    public Company getCompany() {
        return company;
    }
}
