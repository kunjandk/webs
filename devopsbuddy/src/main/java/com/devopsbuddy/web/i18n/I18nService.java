package com.devopsbuddy.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18nService {
    @Autowired
    MessageSource  messageSource;
    //Return a message from given messageId and the default locale in the session context
    //@param messageId the key to the message resource file.
    public String getMessage(String messageId){
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId,locale);
    }

    //returm message from the given messageId and the locale
    //@param messageId The key to the message resouce file.
    // @param locale The locale
    public String getMessage(String messageId, Locale locale){
        return messageSource.getMessage(messageId,null,locale);
    }
}
