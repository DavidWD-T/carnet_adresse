package com.example.contact.controller;


import com.example.contact.controller.dto.ContactDto;
import com.example.contact.repository.UserRepository;
import com.example.contact.repository.entity.Contact;
import com.example.contact.service.ContactService;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {

    private ContactService contactService;
    private UserRepository userRepository;

    public ContactController(ContactService contactService, UserRepository userRepository) {
        this.contactService = contactService;
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public String displayAllContacts(Authentication authentication, Model model){

        List<Contact> contactList = contactService.getAll(authentication.getName());
        model.addAttribute("contacts", contactList);

        return "contactListView";
    }

    @GetMapping("/add")
    public String displayFormContact(Authentication authentication, Model model){

        return "contactForm";
    }

    @PostMapping("/add")
    public String addContact(ContactDto contactDto, Authentication authentication){

        Contact contact = contactService.toContact(contactDto);
        contact.setUser(userRepository.findByEmail(authentication.getName()));
        contactService.addContact(contact);


        return "redirect:/contact/all";
    }

    @PostMapping("delete")
    public void deleteContact(@RequestParam(value = "id") String id){
        Contact contact = contactService.getContactById(id);
        contactService.deleteContact(contact);
    }

    @GetMapping("/edit")
    public String editBook(@RequestParam(value = "id") String id, Model model){
        try {
            Contact contact = contactService.getContactById(id);

            if (contact != null){
                model.addAttribute("contact", contact);
                model.addAttribute("id", id);
                return "contactForm";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("id", null);
        return "redirect:/contact/details";
    }

    @PostMapping("/edit")
    public String editBook(@RequestParam(value = "id") String id, ContactDto contactDto, HttpServletRequest req){

        try {
            contactService.editContact(id, contactDto);

        }catch(Exception e){
            e.printStackTrace();
        }
        req.setAttribute("id", id);
        return "redirect:/books/all";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/details")
    public String displaySpecificContact(HttpServletRequest req, Model model){

        String id = req.getParameter("id");

        Contact contact = contactService.getContactById(id);

        model.addAttribute("contact", contact);
        return "contactDetails";
    }

}
