package com.example.contact.repository.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Basic
    @Column(name = "last_name")
    private String lastName;


    @Basic
    @Column(name = "first_name")
    private String firstName;


    @Basic
    @Column(name = "email")
    private String email;


    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;


    @Basic
    @Column(name = "picture")
    private String picture;


    @Basic
    @Column(name = "birthdate")
    private LocalDate birthDate;

    @Basic
    @Column(name = "company")
    private String company;

    @Basic
    @Column(name = "job")
    private String job;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "country")
    private String country;

    @Basic
    @Column(name = "meeting_date")
    private LocalDate meetingDate;

    @Basic
    @Column(name = "meeting_city")
    private String meetingCity;

    @Basic
    @Column(name = "meeting_country")
    private String meetingCountry;

    @Basic
    @Column(name = "meeting_context")
    private String meetingContext;

    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="user_family",
            joinColumns={@JoinColumn(name="user_id")},
            inverseJoinColumns={@JoinColumn(name="family_id")})
    private List<Contact> familyMembers = new ArrayList<>();

    @ManyToMany(mappedBy="familyMembers")
    private List<Contact> parents = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Contact() {
    }

    public Contact(String lastName, String firstName, String email, String phoneNumber, String picture, LocalDate birthDate, String company, String job, String address, String city, String country, LocalDate meetingDate, String meetingCity, String meetingCountry, String meetingContext, List<Contact> familyMembers, List<Contact> parents, User user) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.picture = picture;
        this.birthDate = birthDate;
        this.company = company;
        this.job = job;
        this.address = address;
        this.city = city;
        this.country = country;
        this.meetingDate = meetingDate;
        this.meetingCity = meetingCity;
        this.meetingCountry = meetingCountry;
        this.meetingContext = meetingContext;
        this.familyMembers = familyMembers;
        this.parents = parents;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingCity() {
        return meetingCity;
    }

    public void setMeetingCity(String meetingCity) {
        this.meetingCity = meetingCity;
    }

    public String getMeetingCountry() {
        return meetingCountry;
    }

    public void setMeetingCountry(String meetingCountry) {
        this.meetingCountry = meetingCountry;
    }

    public String getMeetingContext() {
        return meetingContext;
    }

    public void setMeetingContext(String meetingContext) {
        this.meetingContext = meetingContext;
    }

    public List<Contact> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<Contact> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public List<Contact> getParents() {
        return parents;
    }

    public void setParents(List<Contact> parents) {
        this.parents = parents;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


