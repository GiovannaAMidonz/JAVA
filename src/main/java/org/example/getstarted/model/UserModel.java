package org.example.getstarted.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public class UserModel {
    private long ID;
    private String name;
    private String email;
    private OffsetDateTime birtday;

    public UserModel(long id, String name, String email, OffsetDateTime birtday) {
        this.ID = id;
        this.name = name;
        this.email = email;
        this.birtday = birtday;
    }

    public UserModel() {
    }

    public long getId() {
        return ID;
    }

    public void setId(long id) {
        this.ID = id;
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

    public OffsetDateTime getBirtday() {
        return birtday;
    }

    public void setBirtday(OffsetDateTime birtday) {
        this.birtday = birtday;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return ID == userModel.ID && Objects.equals(name, userModel.name) && Objects.equals(email, userModel.email) && Objects.equals(birtday, userModel.birtday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, email, birtday);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birtday=" + birtday +
                '}';
    }
}
