package com.nseit.Application.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Standard")
public class Standard {

    @Id
    @GeneratedValue
    public Integer id;
    public Integer std;

//    @OneToOne
//    @JoinColumn(name="Teacher_id",referencedColumnName = "id")
//    private Teacher teacher;


    @OneToMany(mappedBy = "standard")
    private Set<Student> student;

//    @ManyToMany(mappedBy = "outputStandard",cascade = CascadeType.ALL)
//    private Set<Student> outputStudents;

}
