package extra_assignment.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Person {
    private String name;
    private LocalDate birthDay;
    private String cccd;

    public Person(String name, LocalDate birthDay, String cccd) {
        this.name = name;
        this.birthDay = birthDay;
        this.cccd = cccd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", cccd='" + cccd + '\'' +
                '}';
    }
}
