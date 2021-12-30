package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


//    | id| root_id| count| enanled| name |

@Entity
@Table(name="tree")
@Data
public class Tree {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long root_id;

    private Integer count;

    private Boolean enabled;

    private String name;

    @Setter(AccessLevel.NONE)
    @Column(name="timestamp")
    private LocalDateTime updatedDateTime=LocalDateTime.now();

}
