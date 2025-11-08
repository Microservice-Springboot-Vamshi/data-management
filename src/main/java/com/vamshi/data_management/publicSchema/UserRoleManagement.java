package com.vamshi.data_management.publicSchema;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_role_management", schema = "public")
public class UserRoleManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String role;

}
