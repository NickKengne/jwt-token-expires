package com.stock.stockservices.task;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @Getter
    private Date created_at;
    @Getter
    @Enumerated(EnumType.STRING)
    private STATUS status;


    public enum STATUS{
        DRAFT,
        IN_PROGRESS,
        FINISHED

    }

}










