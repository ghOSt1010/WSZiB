package com.zadanie2;


public class Employee {

    String name = "";
    String surname = "";
    String email = "@";
    Boolean founDuplicate = false;
    int id = 0;

    Employee(String surname, String name){
        this.name = name;
        this.surname = surname;
        this.email = surname + "." + name + "@mex.com";
    }

    //property getters
    String getName()            { return this.name; }
    String getSurname()         { return this.surname; }
    String getEmail()           { return this.email; }
    Boolean getFounDuplicate()  { return this.founDuplicate; }
    int getId()                 { return this.id; }

    //property setters
    void setName(String name)                       { this.name = name; }
    void setSurname(String surname)                 { this.surname = surname; }
    void setFounDuplicate(Boolean founDuplicate)    { this.founDuplicate = founDuplicate; }
    void setId(int id)                              { this.id = id; }

}
