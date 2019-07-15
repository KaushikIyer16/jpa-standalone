package com.knsi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kaushik.i on 15/07/19.
 */
@Entity(name = "Sample")
@Table(name = "sample")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sample {
    @Id
    private Integer id;

    private String name;
}

