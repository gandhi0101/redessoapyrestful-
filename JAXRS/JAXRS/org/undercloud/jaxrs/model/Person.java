package org.undercloud.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="person")

public class Person{
    private String name;
    private int age;
    private int id;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}