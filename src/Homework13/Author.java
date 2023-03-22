package Homework13;

import java.lang.constant.Constable;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString() {
        return "Name is: "+this.name+" . Author lastname is "+this.lastName;
    }
}


