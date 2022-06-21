package com.upheaval.zimboairtime.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "vendor")
public class Vendor {
    @Id
    private String id;
    private String name;
    private String phone;
    private String pin;
    private String mapping;

    public Vendor(String name, String phone, String pin, String mapping) {
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.mapping = mapping;
    }
}
