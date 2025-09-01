package com.lavado.gonzalo.tema11.ejercicio8.presentacion;

import com.lavado.gonzalo.tema11.configProperties.ConfigLoaderCE;
import com.lavado.gonzalo.tema11.ejercicio8.logica.EmailSender;
import com.lavado.gonzalo.tema11.ejercicio8.logica.MailSessionManager;

public class Main {
    public static void main(String[] args) {
        // Leer Credenciales
        ConfigLoaderCE configLoader = new ConfigLoaderCE("config2.properties");
        // Crear sesión de correo
        MailSessionManager sessionManager = new MailSessionManager(configLoader);
        // Instancia el EmailSender con la sesión creada
        EmailSender emailSender = new EmailSender(sessionManager.getSession());

        final String destinatario = "glavadoj01@suarezdefigueroa.es";
        final String asunto = "Prueba de envío 1";
        final String cuerpo = "Hola,\n\nEste es un mensaje de prueba.\n\nSaludos,\nEquipo de Desarrollo";

        if(emailSender.sendEmail(destinatario, asunto, cuerpo)) {
            System.out.println("Correo enviado exitosamente a " + destinatario);
        } else {
            System.out.println("Error al enviar el correo a " + destinatario);
        }
    }
}
