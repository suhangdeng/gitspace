package com.bjsxt.hashcode;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter

public class Person {
    private String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
