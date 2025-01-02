package org.example;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Apply_Localization_and_Format_Messages {

    public static void main(String[] args) {
        // Sélection de la locale
        Locale localeEn = new Locale("en");
        Locale localeFr = new Locale("fr");

        // Chargement des bundles de main.ressources
        ResourceBundle bundleEn = ResourceBundle.getBundle("messages", localeEn);
        ResourceBundle bundleFr = ResourceBundle.getBundle("messages", localeFr);

        // Exemple de données dynamiques
        String userName = "Alice";
        Date currentDate = new Date();

        // Message en anglais
        String messageEn = bundleEn.getString("greeting");
        String formattedMessageEn = MessageFormat.format(messageEn, userName);
        System.out.println(formattedMessageEn);

        String dateMessageEn = bundleEn.getString("date.format");
        String formattedDateMessageEn = MessageFormat.format(dateMessageEn, currentDate);
        System.out.println(formattedDateMessageEn);

        // Message en français
        String messageFr = bundleFr.getString("greeting");
        String formattedMessageFr = MessageFormat.format(messageFr, userName);
        System.out.println(formattedMessageFr);

        String dateMessageFr = bundleFr.getString("date.format");
        String formattedDateMessageFr = MessageFormat.format(dateMessageFr, currentDate);
        System.out.println(formattedDateMessageFr);
    }
}
