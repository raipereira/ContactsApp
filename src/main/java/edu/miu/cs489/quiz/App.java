package edu.miu.cs489.quiz;

import com.google.gson.Gson;
import edu.miu.cs489.quiz.model.Contact;

public class App {
    public static void main(String[] args) {
        Contact contact = new Contact("John", "Pereira", "MIU Company", "Manager");
        contact.addPhoneNumber("123-456-7890", "Work");
        contact.addEmailAddress("john.doe@example.com", "Work");
        Gson gson = new Gson();
        String jsonContact = gson.toJson(contact);
        System.out.println(jsonContact);
    }
}