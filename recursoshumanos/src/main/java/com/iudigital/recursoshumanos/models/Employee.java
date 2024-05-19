package com.iudigital.recursoshumanos.models;

public class Employee {

    private int id;
    private String typeId;
    private String name;
    private String lastName;
    private String maritalStatus;
    private String genre;
    private String address;
    private String telphone;
    private String dateBirth;

    public Employee(int id, String typeId, String name, String lastName, String maritalStatus, String genre, String address, String telphone, String dateBirth) {
        this.id = id;
        this.typeId = typeId;
        this.name = name;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.genre = genre;
        this.address = address;
        this.telphone = telphone;
        this.dateBirth = dateBirth;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Employee:\n"
                + "\tIdentification: " + id + "\n"
                + "\tType Identification: " + typeId + "\n"
                + "\tName: " + name + "\n"
                + "\tLast Name: " + lastName + "\n"
                + "\tMarital Status: " + maritalStatus + "\n"
                + "\tGenre: " + genre + "\n"
                + "\tAddress: " + address + "\n"
                + "\tTelephone: " + telphone + "\n"
                + "\tDate of Birth: " + dateBirth + "\n";
    }
}
