package com.hendisantika.springdocapisample.repository;

import com.hendisantika.springdocapisample.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 06.33
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ContactInMemoryRepository implements ContactRepository {

    private static final List<Contact> contacts = new ArrayList<>();
}
