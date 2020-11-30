package team.codedone.guice.service.second;

import team.codedone.guice.service.SecondService;

public class SecondServiceLowerImpl implements SecondService {

    public String toUpper(String s) {
        return s.toLowerCase();
    }
}
