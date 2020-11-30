package team.codedone.guice.service;

import com.google.inject.Inject;
import team.codedone.guice.MainService;

import javax.inject.Named;

public class MainServiceImpl implements MainService {

    private final SecondService secondService;

    @Inject
    public MainServiceImpl(@Named("lower") SecondService secondService) {
        this.secondService = secondService;
    }

    public String run() {
        return secondService.toUpper("Ok: " + System.nanoTime());
    }
}
