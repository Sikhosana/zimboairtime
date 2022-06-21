package com.upheaval.zimboairtime.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"transactions"})
@EqualsAndHashCode
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String emailAddress;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    @DBRef
    List<Transaction> transactions;

    public User(String emailAddress, String password, String firstName, String middleName, String lastName, int age) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
}
