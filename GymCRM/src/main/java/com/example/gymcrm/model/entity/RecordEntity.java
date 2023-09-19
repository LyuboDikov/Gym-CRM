package com.example.gymcrm.model.entity;

import com.example.gymcrm.model.enums.ExerciseTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table(name = "records")
public class RecordEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    private UserEntity member;
    @Enumerated(EnumType.STRING)
    private ExerciseTypeEnum exercise;
    @Positive
    private Double kilograms;
    @PastOrPresent
    private LocalDate date;
    private String video_url;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getMember() {
        return member;
    }

    public void setMember(UserEntity member) {
        this.member = member;
    }

    public ExerciseTypeEnum getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseTypeEnum exercise) {
        this.exercise = exercise;
    }

    public Double getKilograms() {
        return kilograms;
    }

    public void setKilograms(Double kilograms) {
        this.kilograms = kilograms;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
}
