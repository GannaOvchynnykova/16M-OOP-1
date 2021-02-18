package de.andron13.data;

/**
 * 16M-OOP
 * 18 12 : 26
 */
public class User {
    private String name;
    private String nick;
    private String email;
    private double bodyMassIndex;
    private double height;
    private double weight;

    User(String name, String nick, String email, double height, double weight) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.height = height;
        this.weight = weight;
        setBodyMassIndex();
    }

    private void setBodyMassIndex() {
        double h = height / 100;
        bodyMassIndex = weight / (h * h);
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }
}

class TestUser {
    public static void main(String[] args) {
        User myLovelyUser = new User("Василий", "hausmaster",
                "вася@пупкин.ру", 195.0, 95.0);
        System.out.println(myLovelyUser.getBodyMassIndex());
    }
}
