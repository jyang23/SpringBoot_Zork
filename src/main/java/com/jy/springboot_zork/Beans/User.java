package com.jy.springboot_zork.Beans;

import javax.persistence.*;

//@Entity creates the table, cannot use the name user as a table
//renamed to user_data (@Table), this is because of heroku. Confuses the system because they
//use a table called user
@Entity
@Table(name="User_Data")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "loot")
    private long loot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLoot() {
        return loot;
    }

    public void setLoot(long loot) {
        this.loot = loot;
    }
}