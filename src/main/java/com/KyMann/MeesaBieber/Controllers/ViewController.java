package com.KyMann.MeesaBieber.Controllers;

import com.KyMann.MeesaBieber.Models.data.JarJarBiebPseudoDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KyleLaptop on 11/10/2017.
 */
@Controller
@RequestMapping("/")
public class ViewController {

    //@Autowired
    //private DatabaseTweetsDao databaseTweetsDao;
    JarJarBiebPseudoDatabase databaseTweetsDao = JarJarBiebPseudoDatabase.getInstance();

    @RequestMapping(value="watch", method = RequestMethod.GET)
    public String viewtweets(Model model) {

        model.addAttribute("tweets", databaseTweetsDao.findAll());

        return "watch.html";
    }
}
