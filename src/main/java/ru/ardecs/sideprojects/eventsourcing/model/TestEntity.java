package ru.ardecs.sideprojects.eventsourcing.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author <a href="mailto:sergey.ilminskih@ardecs.com">Sergey Ilminskih</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}