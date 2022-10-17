package com.example.contact.controller.dto;

import com.example.contact.repository.UserRepository;
import com.example.contact.repository.entity.Contact;
import com.example.contact.repository.entity.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContactDto {

    private String lastName;

    private String firstName;

    private String email;

    private String phoneNumber;

    private String picture;

    private LocalDate birthDate;

    private String company;

    private String job;

    private String address;

    private String city;

    private String country;

    private LocalDate meetingDate;

    private String meetingCity;

    private String meetingCountry;

    private String meetingContext;

    private List<Contact> familyMembers = new ArrayList<>();

    private List<Contact> parents = new ArrayList<>();

    private Long user;

    public ContactDto() {
    }

    public ContactDto(String lastName, String firstName, String email, String phoneNumber, String picture, LocalDate birthDate, String company, String job, String address, String city, String country, LocalDate meetingDate, String meetingCity, String meetingCountry, String meetingContext, List<Contact> familyMembers, List<Contact> parents, Long user) {
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

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }


}
