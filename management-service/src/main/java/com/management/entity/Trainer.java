package com.management.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer_profile")
public class Trainer implements Serializable {
	
	private static final long serialVersionUID = -7021201705390582788L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trainer_id")
	private Long trainerId;
	@Column(name="trainer_name")
	private String name;
	@Column(name="age")
	private String age;
	@Column(name="year_of_experience")
	private Integer yearOfExperience;
	@Column(name="shift_timings")
	private String shiftTimings;
	@Column(name="certification")
	private String certification;
	@Column(name="contact_No")
	private String contactNumber;
	
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Integer getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getShiftTimings() {
		return shiftTimings;
	}
	public void setShiftTimings(String shiftTimings) {
		this.shiftTimings = shiftTimings;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	
	
	
	
	


}
