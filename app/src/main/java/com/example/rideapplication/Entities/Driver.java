package com.example.rideapplication.Entities;

import java.io.Serializable;

public class Driver implements Serializable {
    public int id;
    public String name;
    public String email;
    public String created_at;

    public Driver(int id, String name, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created_at;
    }

    public void setCreated(String created) {
        this.created_at = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created='" + created_at + '\'' +
                '}';
    }


}
