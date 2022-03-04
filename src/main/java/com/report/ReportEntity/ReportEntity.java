package com.report.ReportEntity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ReportEntity {
    
private int id;
private String name;
private String branch;
private Long reg_no;
private String email;
private String camp;
private String year;
private Long cont;
private String degn;

Address address;

}
