package com.lavado.gonzalo.tema11.ejercicio8.logica;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailSender {
    private static final Logger LOGGER = Logger.getLogger(EmailSender.class.getName());
    private final Session session;

    public EmailSender(Session session) {
        this.session = session;
    }

    public boolean sendEmail(String to, String subject, String body) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(session.getProperty("mail.smtp.user")));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            LOGGER.log(Level.INFO, "Correo enviado exitosamente.");
            return true;
        } catch (MessagingException e) {
            LOGGER.log(Level.SEVERE, "Error al enviar el correo", e);
            return false;
        }
    }
}
