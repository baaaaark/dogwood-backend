package com.dogwood.treeguide.models;

import javax.persistence.*;

@Entity
@Table(name = "county_list")
public class County {

    @Id
    @Column(name = "County", unique = true)
    private String name;

    public County(String name) {
        this.name = name;
    }

    public County() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
