package com.move4mobile.appstore.app;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class Build {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @JsonSerialize()
    @ManyToOne
    private Version version;

    private String filePath;

    Build(){}

    public Build(Version version, String filePath) {
        this.version = version;
        this.filePath = filePath;
    }

    public Long getId() {
        return id;
    }

    public Version getVersion() {
        return version;
    }

    public String getFilePath() {
        return filePath;
    }
}
