package com.hendisantika.springdocapisample.controller;

import com.hendisantika.springdocapisample.entity.Contact;
import com.hendisantika.springdocapisample.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 06.42
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getAll() {
        return contactRepository.getAll();
    }

    @GetMapping("/contacts/{id}")
    public Contact getContactById(@PathVariable Long id) {
        return contactRepository.getById(id);
    }

    @PostMapping("/contacts")
    public Contact createNewContact(@RequestBody Contact newContact) {
        return contactRepository.save(newContact);
    }
}
