package net.javaguides.springboot.web;

import net.javaguides.springboot.model.BloodBank1;
import net.javaguides.springboot.model.BloodCamp;
import net.javaguides.springboot.repository.BloodBankRepository;
import net.javaguides.springboot.repository.BloodCampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @Autowired
    private BloodBankRepository bloodBankRepository;

    @Autowired
    private  BloodCampRepository bloodCampRepository;
    @PostMapping("/BBregistration")
    public String BBregistration(@ModelAttribute BloodBank1 bloodBank){

        System.out.println(bloodBank);
        bloodBankRepository.save(bloodBank);
        return "redirect:/BloodBankRegister?success";
    }

    @PostMapping("/BloodDonationCampRegister")
    public String BloodDonationCampRegister(@ModelAttribute BloodCamp bloodCamp){

        System.out.println(bloodCamp);
        bloodCampRepository.save(bloodCamp);
        return "redirect:/BloodDonationCampRegister?success";
    }


}
