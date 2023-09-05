package com.SpringTakeHome.SpringTakeHome.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="TASK")
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Long id;

    @Column(name="TITLE")
    private String title;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="COMPLETED")
    private Boolean completed;
}
