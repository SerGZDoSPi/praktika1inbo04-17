package com.company;

public class TestAuthor {

    public static void main(String[] args) {
	Author nietzsche = new Author("Friedrich Wilhelm Nietzsche", "friedrich-wilhelm-nietzsche@gmail.com", 'M');
	System.out.println(nietzsche.toString());
	nietzsche.setEmail("nietzshe@hotbox.com");
	System.out.println(nietzsche.toString());
    }
}
