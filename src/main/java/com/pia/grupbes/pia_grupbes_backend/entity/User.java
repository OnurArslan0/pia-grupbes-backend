package com.pia.grupbes.pia_grupbes_backend.entity;


import lombok.Data;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String userName;
    private Address address;
    private String weight;
}
