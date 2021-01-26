package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepository;

    public List<Institution> getAll() {
        return institutionRepository.findAll();
    }

    public List<Institution[]> getInstitutionPairs() {
        List<Institution> allInstitutions = this.getAll();
        List<Institution[]> institutionsPairs = new ArrayList<>();
        for (int i = 0; i < allInstitutions.size(); i += 2) {
            Institution[] pair = new Institution[2];
            pair[0] = allInstitutions.get(i);
            if (i + 1 < allInstitutions.size()) {
                pair[1] = allInstitutions.get(i + 1);
            }
            institutionsPairs.add(pair);
        }
        return institutionsPairs;
    }
}