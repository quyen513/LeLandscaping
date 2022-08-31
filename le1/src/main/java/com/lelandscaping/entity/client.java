package com.lelandscaping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_table")
public class client {
    //private variables
    @Id
    @GeneratedValue
    @Column(name="client_id")
    private int clientId;
    @Column(name="full_name")
    private String full_name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;

    //constructors
    public client(){};

    public client(String full_name, String address, String phone) {
        this.full_name = full_name;
        this.address = address;
        this.phone = phone;
    }

    public client(int clientId, String full_name, String address, String phone) {
        this.clientId = clientId;
        this.full_name = full_name;
        this.address = address;
        this.phone = phone;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + clientId;
        result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        client other = (client) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (clientId != other.clientId)
            return false;
        if (full_name == null) {
            if (other.full_name != null)
                return false;
        } else if (!full_name.equals(other.full_name))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "client [address=" + address + ", clientId=" + clientId + ", full_name=" + full_name + ", phone=" + phone
                + "]";
    }


    // getters and setters
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
