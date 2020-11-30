package team.codedone.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import team.codedone.guice.aop.MessageLogger;
import team.codedone.guice.aop.MessageSentLoggable;

public class AOPModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(
                Matchers.any(),
                Matchers.annotatedWith(MessageSentLoggable.class),
                new MessageLogger()
        );
    }
}