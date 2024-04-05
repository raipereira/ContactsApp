package edu.miu.cs489.quiz.model;

public class EmailAddress {
    private String address;
    private String label;

    public EmailAddress(String address, String label) {
        this.address = address;
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public String getLabel() {
        return label;
    }
}
