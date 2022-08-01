package net.javaguides.springboot.service;

import lombok.Data;
import net.javaguides.springboot.model.BloodBank1;
import net.javaguides.springboot.repository.BloodBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class BloodBankServiceImpl implements BloodBankService {

    @Autowired
    private BloodBankRepository bloodBankRepository;

    @Override
    public List<BloodBank1> SearchWithState(String state) {
        return bloodBankRepository.SearchWithState(state);
    }
}
