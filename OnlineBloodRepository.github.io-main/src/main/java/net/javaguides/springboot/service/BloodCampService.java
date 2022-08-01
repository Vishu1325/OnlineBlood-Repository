package net.javaguides.springboot.service;

import net.javaguides.springboot.model.BloodCamp;

import java.util.List;

public interface BloodCampService {
    List<BloodCamp> SearchWithState(String state);

}
