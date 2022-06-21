package com.upheaval.zimboairtime.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Currency;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    @DBRef
    private Vendor vendor;
    @DBRef
    private User user;
    private Date date;
    private Double amount;
    private Currency currency;

    public Transaction(Vendor vendor, Date date, Double amount, Currency currency, User user) {
        this.vendor = vendor;
        this.date = date;
        this.amount = amount;
        this.currency = currency;
        this.user = user;
    }
}
