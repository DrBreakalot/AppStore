package com.move4mobile.appstore.app;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class Version {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "version")
    private List<Build> builds;

    @JsonIgnore
    @ManyToOne
    private App app;

    Version() {}

    public Version(App app, String name, List<Build> builds) {
        this.app = app;
        this.name = name;
        this.builds = builds;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Build> getBuilds() {
        return builds;
    }

    public App getApp() {
        return app;
    }
}
