package com.nseit.Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Teacher")

public class Teacher {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public String subject;
    public Integer std;
    public Integer dob;
    public long mobileNumber;

    @OneToOne
    @JoinColumn(name="StdTeacher_id",referencedColumnName = "id")
    private Standard standard;
}
