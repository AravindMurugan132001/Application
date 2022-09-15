package com.nseit.Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")

public class Student {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public Integer std;
    public Integer dob;
    public String bloodGroup;
    public long mobileNumber;

//    @ManyToMany
//    @JoinTable(name="standard_std",joinColumns = @JoinColumn(name ="student_id",referencedColumnName = "id"),
//    inverseJoinColumns = @JoinColumn(name = "standard_id",referencedColumnName = "id"))
//    private Set<Standard> outputStandard;

    @ManyToOne
    @JoinColumn(name="Standard_id",referencedColumnName = "id")
    private Standard standard;


}

