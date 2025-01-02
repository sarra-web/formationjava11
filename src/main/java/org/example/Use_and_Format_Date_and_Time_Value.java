package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Use_and_Format_Date_and_Time_Value {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // Date actuelle
        LocalTime currentTime = LocalTime.now(); // Heure actuelle
        LocalDateTime currentDateTime = LocalDateTime.now(); // Date et heure actuelles

        System.out.println("Date actuelle : " + currentDate);
        System.out.println("Heure actuelle : " + currentTime);
        System.out.println("Date et heure actuelles : " + currentDateTime);

        // Créer un format personnalisé
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Formater la date et l'heure

        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Date et heure formatées : " + formattedDateTime);


//Convertir une Chaîne en Date (parse date)
        String dateStr = "15-08-2023";

        // Définir le format
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//!!!il faut avoir le meme format

        // Convertir la chaîne en LocalDate
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);

        System.out.println("Date convertie : " + parsedDate);

        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String date2 = parsedDate.format(formatter2);

        System.out.println(date2);


        LocalDateTime today = LocalDateTime.now();

        // Ajouter des jours
        LocalDateTime nextWeek = today.plusDays(7);

        // Soustraire des mois
        LocalDate lastMonth = LocalDate.from(today.minusMonths(1));

        System.out.println("Aujourd'hui : " + today);
        System.out.println("Dans une semaine : " + nextWeek);
        System.out.println("Le mois dernier : " + lastMonth);


        LocalTime current = LocalTime.of(12,1);
        System.out.println(current);
        Duration duration=Duration.between(LocalTime.now(),current);
        System.out.println(duration);
    }
}
