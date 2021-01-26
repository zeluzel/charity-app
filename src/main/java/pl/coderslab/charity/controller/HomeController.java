package pl.coderslab.charity.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

@Controller
@RequestMapping("/")
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @GetMapping
    public String homeAction(Model model) {
        log.debug("Accessing homepage");
        model.addAttribute("institutions", institutionService.getAll());
        model.addAttribute("institutionsPairs", institutionService.getInstitutionPairs());
        model.addAttribute("numOfBags", donationService.getNumberOfBags());
        model.addAttribute("numOfDonations", donationService.getNumberOfDonations());
        return "index";
    }

}
