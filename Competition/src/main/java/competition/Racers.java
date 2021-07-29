/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

/**
 *
 * @author elcan
 */
public class Racers {

    private String name;
    private String surname;
    private int age;
    private int force;

    public Racers() {

    }

    public Racers(String name, String surname, int age, int force) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String racersInfo() {

        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getForce();
    }
public String getinfoWithoutForce(){
    
     return this.getName() + " " + this.getSurname() + " " + this.getAge();
    
}
}
