package SecretSanta;

import java.util.ArrayList;

public class Person {
    int id;
    String firstName, surName;
    ArrayList<String> choices = new ArrayList<String>();

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getSurName() {
        return surName;
    }

    void setSurName(String surName) {
        this.surName = surName;
    }

    String getChoice(int choiceNum) {
        return this.choices.get(choiceNum);
    }

    void setChoice(String choice) {
        this.choices.add(choice);
    }

}
