package com.mprog;

import com.mprog.config.MainConfig;
import com.mprog.config.Settings;
import com.mprog.dto.PersonData;
import com.mprog.dto.UserDto;
import com.mprog.service.ConversationService;
import com.mprog.service.LocaleService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;
import java.util.Locale;

@Slf4j
@ComponentScan
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(App.class);

        var locale = context.getBean(LocaleService.class);
        locale.setCurrent(Locale.forLanguageTag("ru"));

        log.info("locale: " + locale.getCurrent());

        context.getBean(ConversationService.class).doConversation();
    }

    private static void propertiesTest() {
        var context = new AnnotationConfigApplicationContext(App.class);

        var settings = context.getBean(Settings.class);
        log.info(settings + "");

        var mainConfig = context.getBean(MainConfig.class);
        log.info(mainConfig.getRandom() + "");
        log.info(new MainConfig().getRandom() + "");


        mainConfig.doSomeStuff();

        log.info("dangerous: " + mainConfig.getDangerousField());
    }

    private static void lombokTest() {
        log.info("Hi!");

        var user = new UserDto(1, "Bill", LocalDate.now());
        log.info(user + "");

        var person = new PersonData();
        person.setId(1);
        person.setFio("Peter");
        person.setBirthday(LocalDate.now());

        log.info(person + "");
    }
}
