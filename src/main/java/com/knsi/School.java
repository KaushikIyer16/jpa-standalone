package com.knsi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kaushik.i on 15/07/19.
 */
@Entity(name = "School")
@Table(name = "school")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

    @Id
    private Integer code;
    private String name;
    private String address;

    @OneToMany(mappedBy = "school", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Teacher> teacherList;
}
