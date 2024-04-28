package com.gui.dvdrentalapp.customer.domain;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customer_Id;

    @Column(name = "store_id")
    private long storeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "address_id")
    private long addressId;
    @Column(name = "activebool")
    private boolean activebool;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
    @Column(name = "active")
    private int active;

    public Customer(long storeId, String firstName, String lastName, String email, long addressId, boolean activebool, LocalDate createDate, LocalDateTime lastUpdate, int active) {
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.activebool = activebool;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.active = active;
    }

    public Customer() {

    }

    public long getCustomer_Id() {
        return customer_Id;
    }

    public long getStoreId() {
        return storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getAddressId() {
        return addressId;
    }

    public boolean isActivebool() {
        return activebool;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public int getActive() {
        return active;
    }
}
