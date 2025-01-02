package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDate {


    public static void main(String[] args) {
        // Obtenir la date, l'heure et la zone temporelle actuelles
        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();

        System.out.println("Date et heure avec zone actuelle : " + currentZoneDateTime);


        ZoneId zoneId = ZoneId.of("America/New_York");

        // Obtenir la date et l'heure pour cette zone
        ZonedDateTime dateTimeInZone = ZonedDateTime.now(zoneId);

        System.out.println("Date et heure pour New York : " + dateTimeInZone);

        // Obtenir la date, l'heure et la zone actuelle
        ZonedDateTime currentDateTime = ZonedDateTime.now();

        // Définir un format personnalisé
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z VV");

        // Formater la date avec la zone
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Date et heure formatées avec la zone : " + formattedDateTime);

        System.out.println("Liste des zones disponibles :");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
