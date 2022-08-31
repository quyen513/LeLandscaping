package com.lelandscaping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client_detail")
public class details {
    @Id
    @GeneratedValue
    @Column(name="house_id")
    private int house_id;
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
    
    @Column(name="client_id")
    private int client_id;

    

    // constructors
    public details() {
    }

    public details(int charge, String frequent, String worktype, String payment, String schedule, String workdate,
            int client_id) {
        this.charge = charge;
        this.frequent = frequent;
        this.worktype = worktype;
        this.payment = payment;
        this.schedule = schedule;
        this.workdate = workdate;
        this.client_id = client_id;
    }

    public details(int house_id, int charge, String frequent, String worktype, String payment, String schedule,
            String workdate, int client_id) {
        this.house_id = house_id;
        this.charge = charge;
        this.frequent = frequent;
        this.worktype = worktype;
        this.payment = payment;
        this.schedule = schedule;
        this.workdate = workdate;
        this.client_id = client_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
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

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
    
}

