package com.example.lenovo.bikeworks.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class MyData {
    @PrimaryKey
            int id;
    String Bike_number;

    String repair;
    String extraDetails;
    String custNum;

    String cust_name;

    public String getBike_number() {
        return Bike_number;
    }

    public void setBike_number(String bike_number) {
        Bike_number = bike_number;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public String getExtraDetails() {
        return extraDetails;
    }

    public void setExtraDetails(String extraDetails) {
        this.extraDetails = extraDetails;
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }



}
