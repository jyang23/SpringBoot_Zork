package com.jy.springboot_zork;

import com.jy.springboot_zork.Beans.User;
import com.jy.springboot_zork.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    UserRepository  userRepository;


    int foyer = 0;
    int diningroom = 0;
    int frontroom = 0;
    int kitchen = 0;
    int library = 0;
    int parlor = 0;
    int secretroom = 0;
    int vault = 0;

    @RequestMapping("/")
    public String homePage(Model model)
    {
        User user = new User();
        user.setLoot(0);
        user.setId(1);
        userRepository.save(user);
        model.addAttribute("users",userRepository.findAll());
        return "ZorkGame";
    }

    @RequestMapping("/add/{room}/{id}")
    public String addMoney(@PathVariable("id") long loot, @PathVariable("room") String room)
    {
        User user = userRepository.findById(1);
        long money = user.getLoot();
        money = money + loot;
        user.setLoot(money);
        userRepository.save(user);
        return room;
    }

    @RequestMapping("/diningroom")
    public String diningroom(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "diningroom";
    }

    @RequestMapping("/foyer")
    public String foyer(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "foyer";
    }

    @RequestMapping("/frontroom")
    public String frontroom(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "frontroom";
    }

    @RequestMapping("/kitchen")
    public String kitchen(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "kitchen";
    }

    @RequestMapping("/library")
    public String library(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "library";
    }

    @RequestMapping("/parlor")
    public String parlor(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "parlor";
    }

    @RequestMapping("/secretroom")
    public String secretroom(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "secretroom";
    }

    @RequestMapping("/vault")
    public String vault(Model model)
    {
        model.addAttribute("users",userRepository.findAll());
        return "vault";
    }
}
