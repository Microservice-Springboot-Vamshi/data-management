package com.vamshi.data_management.publicSchema;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_management", schema = "public")
public class UserManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private Long phoneNumber;
    private Long UserId;
    private String emailId;
    private String role;
}
