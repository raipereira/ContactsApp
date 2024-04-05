package edu.miu.cs489.quiz.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
        private String firstName;
        private String lastName;
        private String company;
        private String jobTitle;
        private List<Phone> phoneNumbers;
        private List<EmailAddress> emailAddresses;

        public Contact(String firstName, String lastName, String company, String jobTitle) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.company = company;
            this.jobTitle = jobTitle;
            this.phoneNumbers = new ArrayList<>();
            this.emailAddresses = new ArrayList<>();
        }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void addPhoneNumber(String number, String label) {
        phoneNumbers.add(new Phone(number, label));
    }

    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new EmailAddress(address, label));
    }
}


