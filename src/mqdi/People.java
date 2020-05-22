package mqdi;

import java.io.Serializable;

public class People implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private String gender;
    private String age;

    public People(){}

    public People(Integer id,String name, String surname, String gender, String age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String toString(){
        return id+" "+name+" "+surname+" "+gender+" "+age;
    }
}