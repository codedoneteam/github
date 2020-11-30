package team.codedone.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import team.codedone.guice.MainService;
import team.codedone.guice.service.MainServiceImpl;
import team.codedone.guice.service.SecondService;
import team.codedone.guice.service.second.SecondServiceLowerImpl;
import team.codedone.guice.service.second.SecondServiceUpperImpl;

public class BasicModule extends AbstractModule {
    protected void configure() {
        bind(MainService.class).to(MainServiceImpl.class).in(Scopes.SINGLETON);
        bind(SecondService.class).annotatedWith(Names.named("upper")).to(SecondServiceUpperImpl.class);
        bind(SecondService.class).annotatedWith(Names.named("lower")).to(SecondServiceLowerImpl.class);
    }
}
