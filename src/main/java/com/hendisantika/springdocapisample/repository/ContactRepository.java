package com.hendisantika.springdocapisample.repository;

import com.hendisantika.springdocapisample.entity.Contact;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 06.32
 * To change this template use File | Settings | File Templates.
 */
public interface ContactRepository {
    List<Contact> getAll();

    Contact getById(Long id);

    Contact save(Contact newContact);

    Contact update(Contact newContact);

    void delete(Long id);
}
