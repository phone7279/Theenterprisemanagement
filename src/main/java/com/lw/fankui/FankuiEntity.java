package com.lw.fankui;

import javax.persistence.*;

@Entity
@Table(name = "fankui", schema = "test")
public class FankuiEntity {
    private int id;
    private String name = null;
    private String email = null;
    private String phone = null;
    private String message = null;
    private String jEmail = null;
    private String jMessage = null;
    private String pass = null;

    public FankuiEntity() {
    }

    public FankuiEntity(String name, String email, String phone, String message, String pass) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "j_email")
    public String getjEmail() {
        return jEmail;
    }

    public void setjEmail(String jEmail) {
        this.jEmail = jEmail;
    }

    @Basic
    @Column(name = "j_message")
    public String getjMessage() {
        return jMessage;
    }

    public void setjMessage(String jMessage) {
        this.jMessage = jMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FankuiEntity that = (FankuiEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (jEmail != null ? !jEmail.equals(that.jEmail) : that.jEmail != null) return false;
        if (jMessage != null ? !jMessage.equals(that.jMessage) : that.jMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (jEmail != null ? jEmail.hashCode() : 0);
        result = 31 * result + (jMessage != null ? jMessage.hashCode() : 0);
        return result;
    }
}
