package net.javaguides.springboot.service;

import lombok.Data;
import net.javaguides.springboot.model.BloodCamp;
import net.javaguides.springboot.repository.BloodCampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class BloodCampServiceImpl implements BloodCampService {

    @Autowired
    private BloodCampRepository bloodCampRepository;

    @Override
    public List<BloodCamp> SearchWithState(String state) {
        return bloodCampRepository.SearchWithState(state);
    }
}
