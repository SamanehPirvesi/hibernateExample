package com.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "USER_DETAIL")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	@Column(name = "NAME")
	private String name;
	/**
	 * if we do not use this column in database
	 */
	@Transient
	private String surNmae;
	@ElementCollection
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
    @CollectionId(columns = { @Column(name="addressId")},generator = "hilo-gen", type = @Type(type="long"))
//	
	private Set<Address> addresses=new HashSet<Address>();

	public User() {

	}

	public User(String name, String surNmae) {

		this.name = name;
		this.surNmae = surNmae;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurNmae() {
		return surNmae;
	}

	public void setSurNmae(String surNmae) {
		this.surNmae = surNmae;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public void addAdress(Address a) {
		addresses.add(a);
		
	}

}

