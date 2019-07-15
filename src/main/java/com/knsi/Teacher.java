package com.knsi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by kaushik.i on 15/07/19.
 */
@Entity(name = "Teacher")
@Table(name = "teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "code", nullable = false)
    private School school;
}
