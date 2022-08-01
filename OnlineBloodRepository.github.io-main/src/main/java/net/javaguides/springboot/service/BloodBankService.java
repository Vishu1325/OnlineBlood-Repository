package net.javaguides.springboot.service;

import net.javaguides.springboot.model.BloodBank1;

import java.util.List;

public interface BloodBankService {
    List<BloodBank1> SearchWithState(String state);

}
