package com.example.gymcrm.model.entity;

import com.example.gymcrm.model.enums.UserRoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

    public RoleEntity() {
    }

    public UserRoleEnum getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRoleEnum userRole) {
        this.userRole = userRole;
    }
}
