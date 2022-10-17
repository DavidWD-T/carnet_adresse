package com.example.contact.repository;

import com.example.contact.repository.entity.Contact;
import com.example.contact.repository.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactRepository  extends CrudRepository<Contact, Long> {

    @Query("SELECT c FROM Contact c WHERE c.email = :email")
    User findByEmail(@Param("email") String email);

    @Query("SELECT c FROM Contact c WHERE c.user = :id")
    List<Contact> findByUserId(@Param("id") Long id);
}
