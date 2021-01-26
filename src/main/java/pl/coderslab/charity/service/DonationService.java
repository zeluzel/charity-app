package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    public Integer getNumberOfBags() {
        List<Donation> donations = donationRepository.findAll();
        Integer numOfBags = 0;
        for (Donation donation : donations) {
            numOfBags += donation.getQuantity();
        }
        return numOfBags;
    }

    public Long getNumberOfDonations() {
        return donationRepository.count();
    }

}
