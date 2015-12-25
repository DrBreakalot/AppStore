package com.move4mobile.appstore.app;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
public class App {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "app")
    private List<Build> builds;

    App() {}

    public App(String name, List<Build> builds) {
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
}
