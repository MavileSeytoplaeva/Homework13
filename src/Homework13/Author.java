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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name)&&lastName.equals(a2.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name+lastName);
    }
}


