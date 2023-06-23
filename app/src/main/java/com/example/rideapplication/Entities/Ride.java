package com.example.rideapplication.Entities;

import java.io.Serializable;
import java.util.Date;

public class Ride implements Serializable {
    int Id;
    int UserId;
    int DriverId;
    String PickupLocation;
    String DropoffLocation;
    Date RideDatetime;
    String RideStatus;
    String  RideType;
    String VehicleType;
    String PaymentType;
    Float PaymentAmount;

    public Ride(int id, int userId, int driverId, String pickupLocation, String dropoffLocation, Date rideDatetime, String rideStatus, String rideType, String vehicleType, String paymentType, Float paymentAmount) {
        Id = id;
        UserId = userId;
        DriverId = driverId;
        PickupLocation = pickupLocation;
        DropoffLocation = dropoffLocation;
        RideDatetime = rideDatetime;
        RideStatus = rideStatus;
        RideType = rideType;
        VehicleType = vehicleType;
        PaymentType = paymentType;
        PaymentAmount = paymentAmount;
    }

    public int getId() {
        return Id;
    }

    public int getUserId() {
        return UserId;
    }

    public int getDriverId() {
        return DriverId;
    }

    public String getPickupLocation() {
        return PickupLocation;
    }

    public String getDropoffLocation() {
        return DropoffLocation;
    }

    public Date getRideDatetime() {
        return RideDatetime;
    }

    public String getRideStatus() {
        return RideStatus;
    }

    public String getRideType() {
        return RideType;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public Float getPaymentAmount() {
        return PaymentAmount;
    }
}
