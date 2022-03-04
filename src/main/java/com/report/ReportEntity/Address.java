package com.report.ReportEntity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Address {
private String country;
private String state;
private String city;
}
