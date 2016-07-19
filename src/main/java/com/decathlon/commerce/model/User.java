package com.decathlon.commerce.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="epay.fwkuser")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String userid;

	@Column(name="NAME", nullable=true)
	private String name;
	
	@NotEmpty
	@Column(name="EMAIL", nullable=true)
	private String email;
		
	@NotEmpty
	@Column(name="SITE", nullable=true)
	private String site;

	@NotEmpty
	@Column(name="COUNTRY", nullable=true)
	private String country;

	@NotEmpty
	@Column(name="LANGUAGE", nullable=true)
	private String language;

	@NotEmpty
	@Column(name="MOBILE", nullable=true)
	private String mobile;

	@NotEmpty
	@Column(name="JOBNAME", nullable=true)
	private String jobname;

	@NotEmpty
	@Column(name="USERTYPE", nullable=true)
	private String usertype;

	@Column(name="PASSWORD", nullable=true)
	private String password;



//	@NotEmpty
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "APP_USER_USER_PROFILE",
//             joinColumns = { @JoinColumn(name = "USER_ID") },
//             inverseJoinColumns = { @JoinColumn(name = "USER_PROFILE_ID") })
//	private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

	public User() {
	}

	public User(String name, String email, String site, String country, String language, String mobile, String jobname, String usertype, String password, Set<UserProfile> userProfiles) {
		this.name = name;
		this.email = email;
		this.site = site;
		this.country = country;
		this.language = language;
		this.mobile = mobile;
		this.jobname = jobname;
		this.usertype = usertype;
		this.password = password;
//		this.userProfiles = userProfiles;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Set<UserProfile> getUserProfiles() {
//		return userProfiles;
//	}
//
//	public void setUserProfiles(Set<UserProfile> userProfiles) {
//		this.userProfiles = userProfiles;
//	}



	@Override
	public String toString() {
		return "User{" +
				"userid=" + userid +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", site='" + site + '\'' +
				", country='" + country + '\'' +
				", language='" + language + '\'' +
				", mobile='" + mobile + '\'' +
				", jobname='" + jobname + '\'' +
				", usertype='" + usertype + '\'' +
				", password='" + password + '\'' +
//				", userProfiles=" + userProfiles +
				'}';
	}
}
