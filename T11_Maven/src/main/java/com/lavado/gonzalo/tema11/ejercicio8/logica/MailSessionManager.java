package com.lavado.gonzalo.tema11.ejercicio8.logica;

import com.lavado.gonzalo.tema11.configProperties.ConfigLoaderCE;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailSessionManager {
    private final Session session;

    public MailSessionManager(ConfigLoaderCE configLoader) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user", configLoader.getCEUser());

        session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(configLoader.getCEUser(), configLoader.getCEPassword());
            }
        });
    }

    public Session getSession() {
        return session;
    }
}
