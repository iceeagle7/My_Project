package com.company;

public class Patient {

    private int id;
    private String FIO,
            address,
            phone_number;
    private String diagnosis;
    private String phone_medicine_card;

    public Patient(int id, String FIO, String address, String phone_number, String diagnosis, String phone_medicine_card) {
        this.id = id;
        this.FIO = FIO;
        this.address = address;
        this.phone_number = phone_number;
        this.diagnosis = diagnosis;
        this.phone_medicine_card = phone_medicine_card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPhone_medicine_card() {
        return phone_medicine_card;
    }

    public void setPhone_medicine_card(String phone_medicine_card) {
        this.phone_medicine_card = phone_medicine_card;
    }

    public String toString(){
        return "Patient{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", phone_medicine_card=" + phone_medicine_card + '\'' +
                '}';
    }


}
