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
    @Column(name="charge")
    private int charge;
    @Column(name="frequent")
    private String frequent;
    @Column(name="worktype")
    private String worktype;
    @Column(name="payment")
    private String payment;
    @Column(name="schedule")
    private String schedule;
    @Column(name="workdate")
    private String workdate;
    
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

    

   

    public client(String full_name, String address, String phone, int charge, String frequent, String worktype,
            String payment, String schedule, String workdate) {
        this.full_name = full_name;
        this.address = address;
        this.phone = phone;
        this.charge = charge;
        this.frequent = frequent;
        this.worktype = worktype;
        this.payment = payment;
        this.schedule = schedule;
        this.workdate = workdate;
    }

    public client(int clientId, String full_name, String address, String phone, int charge, String frequent,
            String worktype, String payment, String schedule, String workdate) {
        this.clientId = clientId;
        this.full_name = full_name;
        this.address = address;
        this.phone = phone;
        this.charge = charge;
        this.frequent = frequent;
        this.worktype = worktype;
        this.payment = payment;
        this.schedule = schedule;
        this.workdate = workdate;
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

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getFrequent() {
        return frequent;
    }

    public void setFrequent(String frequent) {
        this.frequent = frequent;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

}
