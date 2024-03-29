package com.branchservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "branch")
public class Branch implements Serializable {
	private static final long serialVersionUID = -1516965327693370237L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "branch_id")
	private Long branchId;
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	@Column(name="contact_info")
	public Long contactInfo;
	
	
	
	
	
//  @OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "user_id")
	//private UserRegistration userRegistration;
	
	

}
