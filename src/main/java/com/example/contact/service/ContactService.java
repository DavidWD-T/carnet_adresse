package com.example.contact.service;


import com.example.contact.controller.dto.ContactDto;
import com.example.contact.repository.ContactRepository;
import com.example.contact.repository.UserRepository;
import com.example.contact.repository.entity.Contact;
import com.example.contact.repository.entity.User;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private ContactRepository contactRepository;
    private UserRepository userRepository;

    public ContactService(ContactRepository contactRepository, UserRepository userRepository) {
        this.contactRepository = contactRepository;
        this.userRepository = userRepository;
    }



    public List<Contact> getAll(String email){

        User user = userRepository.findByEmail(email);
        List<Contact> contactList = (List) contactRepository.findByUserId(user.getId());

        return contactList;
    }


    public List<Contact> getByKeyWord(){
        List<Contact> contactList = (List) contactRepository.findAll();

        return contactList;
    }

    public void addContact(Contact contact){

        contactRepository.save(contact);

    }

    public Contact toContact(ContactDto contactDto){

        Contact contact = new Contact();
        contact.setAddress(contactDto.getAddress());
        contact.setCity(contactDto.getCity());
        contact.setCompany(contactDto.getCompany());
        contact.setCountry(contactDto.getCountry());
        contact.setMeetingCity(contactDto.getMeetingCity());
        contact.setMeetingContext(contactDto.getMeetingContext());
        contact.setMeetingCountry(contactDto.getMeetingCountry());
        contact.setJob(contactDto.getJob());
        contact.setEmail(contactDto.getEmail());
        contact.setParents(contactDto.getParents());
        contact.setFamilyMembers(contactDto.getFamilyMembers());
        contact.setBirthDate(contactDto.getBirthDate());
        contact.setPhoneNumber(contactDto.getPhoneNumber());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setPicture(contactDto.getPicture());

        return contact;

    }

    public void deleteContact(Contact contact) {
        contactRepository.delete(contact);
    }

    public Contact getContactById(String id) {

        return contactRepository.findById(Long.parseLong(id)).get();
    };

    public void editContact(String id, ContactDto contactDto) {

        Contact contact= contactRepository.findById(Long.parseLong(id)).orElseThrow(() -> new NotFoundException("Contact inexistant"));

        contact.setAddress(contactDto.getAddress());
        contact.setCity(contactDto.getCity());
        contact.setCompany(contactDto.getCompany());
        contact.setCountry(contactDto.getCountry());
        contact.setMeetingCity(contactDto.getMeetingCity());
        contact.setMeetingContext(contactDto.getMeetingContext());
        contact.setMeetingCountry(contactDto.getMeetingCountry());
        contact.setJob(contactDto.getJob());
        contact.setEmail(contactDto.getEmail());
        contact.setParents(contactDto.getParents());
        contact.setFamilyMembers(contactDto.getFamilyMembers());
        contact.setBirthDate(contactDto.getBirthDate());
        contact.setPhoneNumber(contactDto.getPhoneNumber());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setPicture(contactDto.getPicture());

        contactRepository.save(contact);
    }
}
