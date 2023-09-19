package com.example.gymcrm.model.entity;

import com.example.gymcrm.model.enums.SubscriptionTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.PastOrPresent;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "subscriptions")
public class SubscriptionEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private SubscriptionTypeEnum type;
    @Column(nullable = false, scale = 2, precision = 19)
    private BigDecimal price;
    @Column(name = "start_date", nullable = false)
    @PastOrPresent
    private LocalDate startDate;
    @Column(name = "end_date")
    @Future
    private LocalDate endDate;
    @Column(name = "is_active")
    private boolean isActive;
    @OneToOne
    private UserEntity member;

    public SubscriptionEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubscriptionTypeEnum getType() {
        return type;
    }

    public void setType(SubscriptionTypeEnum type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public UserEntity getMember() {
        return member;
    }

    public void setMember(UserEntity member) {
        this.member = member;
    }
}
