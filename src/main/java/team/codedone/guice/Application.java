package team.codedone.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import team.codedone.guice.module.AOPModule;
import team.codedone.guice.module.BasicModule;

public class Application {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule(), new AOPModule());
        MainService mainService = injector.getInstance(MainService.class);
        String s = mainService.run();
        System.out.println(s);
        String s1 = mainService.run();
        System.out.println(s1);
    }

}
