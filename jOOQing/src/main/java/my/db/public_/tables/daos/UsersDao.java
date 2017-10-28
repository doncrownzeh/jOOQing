/*
 * This file is generated by jOOQ.
*/
package my.db.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import my.db.public_.tables.Users;
import my.db.public_.tables.records.UsersRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersDao extends DAOImpl<UsersRecord, my.db.public_.tables.pojos.Users, Integer> {

    /**
     * Create a new UsersDao without any configuration
     */
    public UsersDao() {
        super(Users.USERS, my.db.public_.tables.pojos.Users.class);
    }

    /**
     * Create a new UsersDao with an attached configuration
     */
    public UsersDao(Configuration configuration) {
        super(Users.USERS, my.db.public_.tables.pojos.Users.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(my.db.public_.tables.pojos.Users object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<my.db.public_.tables.pojos.Users> fetchById(Integer... values) {
        return fetch(Users.USERS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public my.db.public_.tables.pojos.Users fetchOneById(Integer value) {
        return fetchOne(Users.USERS.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<my.db.public_.tables.pojos.Users> fetchByName(String... values) {
        return fetch(Users.USERS.NAME, values);
    }

    /**
     * Fetch records that have <code>lastname IN (values)</code>
     */
    public List<my.db.public_.tables.pojos.Users> fetchByLastname(String... values) {
        return fetch(Users.USERS.LASTNAME, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<my.db.public_.tables.pojos.Users> fetchByEmail(String... values) {
        return fetch(Users.USERS.EMAIL, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<my.db.public_.tables.pojos.Users> fetchByPassword(String... values) {
        return fetch(Users.USERS.PASSWORD, values);
    }
}
