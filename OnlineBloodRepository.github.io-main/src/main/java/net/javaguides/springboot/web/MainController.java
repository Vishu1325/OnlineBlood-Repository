package net.javaguides.springboot.web;

import net.javaguides.springboot.model.BloodBank1;
import net.javaguides.springboot.model.BloodCamp;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.service.BloodBankService;
import net.javaguides.springboot.service.BloodCampService;
import net.javaguides.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private BloodBankService bloodBankService;

    @Autowired
    private BloodCampService bloodCampService;




    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/BloodAvailabilitySearchResult")
    public String  BloodAvailabilitySearch(Model model , @RequestParam String bloodGroup , @RequestParam String pinCode) {

        List<User> User = new ArrayList<>(userService.filterDataWithPinCodeAndBloodGroup(bloodGroup,pinCode));
        System.out.println(User);
        model.addAttribute("User" , User);

        return "BloodAvailabilitySearchResult";
    }

    @GetMapping("/BloodAvailabilitySearch")
    public String  BloodAvailabilitySearch() {
        return "BloodAvailabilitySearch";
    }

    @GetMapping("/RareBlood")
    public String RareBlood(Model model){
        List<User> User = new ArrayList<>(userService.rareblood());
        System.out.println(User);
        model.addAttribute("User" , User);
        return "RareBlood";

    }


        @GetMapping("/BloodBank")
    public String  BloodBank() {
        return "BloodBank";
    }

    @GetMapping("/BloodBankRegister")
    public String  BloodBankRegister() {
        return "BloodBankRegister";
    }

    @GetMapping("/BloodBankSearch")
    public String  BloodBankSearch() {
        return "BloodBankSearch";
    }

    @GetMapping("/BloodBankSearchResult")
    public String  BloodBankSearchResult(Model model ,@RequestParam String state) {

        List<BloodBank1> BloodBank = new ArrayList<>(bloodBankService.SearchWithState(state));
        System.out.println(BloodBank);
        model.addAttribute("BloodBank" , BloodBank);
        return "BloodBankSearchResult";
    }


    @GetMapping("/BloodDonationCamp")
    public String  BloodDonationCamp() {
        return "BloodDonationCamp";
    }

    @GetMapping("/BloodDonationCampRegister")
    public String  BloodDonationCampRegister() {
        return "BloodDonationCampRegister";
    }


    @GetMapping("/BloodDonationCampSearch")
    public String  BloodDonationCampSearch() {
        return "BloodDonationCampSearch";
    }

    @GetMapping("/BloodCampSearchResult")
    public String  BloodCampSearchResult(Model model ,@RequestParam String state) {

        List<BloodCamp> BloodCamp = new ArrayList<>(bloodCampService.SearchWithState(state));
        System.out.println(BloodCamp);
        model.addAttribute("BloodCamp" , BloodCamp);
        return "BloodDonationCampSearchResult";
    }


    @GetMapping("/CompatibleBlood")
    public String  CompatibleBlood() {
        return "CompatibleBlood";
    }

    @GetMapping("/AboutUs")
    public String  AboutUs() {
        return "AboutUs";
    }



}