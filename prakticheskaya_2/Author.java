package com.company;

public class Author {
    private String name ="";
    private String email;
    private char geder;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if( "m, f, u".contains(Character.toString(gender).toLowerCase())){
            this.geder = gender;
        }
    }

    public char getGeder() {
        return geder;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return this.getName + " (" + this.getGeder + ')' + " at " + this.getEmail;
    }
}
