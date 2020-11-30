package team.codedone.guice.service.second;

import team.codedone.guice.aop.MessageSentLoggable;
import team.codedone.guice.service.SecondService;

public class SecondServiceUpperImpl implements SecondService {

    @MessageSentLoggable
    public String toUpper(String s) {
        return s.toUpperCase();
    }
}
