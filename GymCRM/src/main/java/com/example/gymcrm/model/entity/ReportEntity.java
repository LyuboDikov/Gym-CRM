package com.example.gymcrm.model.entity;

import com.example.gymcrm.model.enums.ReportTypeEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reports")
public class ReportEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private ReportTypeEnum type;
    @ManyToOne
    private UserEntity user;

    public ReportEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ReportTypeEnum getType() {
        return type;
    }

    public void setType(ReportTypeEnum type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
