package org.example.Java_IO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

// Classe Person à sérialiser
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommandé pour des classes Serializable

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private int id;
    private String name;
    private String email;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Serialisation {
    public static void main(String[] args) {
        try {
            // Sérialisation : écriture d'un objet dans un fichier
            Person person = new Person("John", 25);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            out.writeObject(person);
            out.close();
            System.out.println("Objet sérialisé avec succès.");

            // Désérialisation : lecture d'un objet depuis un fichier  en utilisnat ObjectInputStream==>binaire
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            Person readPerson = (Person) in.readObject();
            in.close();
            System.out.println("Objet désérialisé avec succès : " + readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }




        /** lire une fichier text**/

  /*      try (BufferedReader reader = new BufferedReader(new FileReader("sarra.txt"))) {
            // Lire les données du fichier ligne par ligne
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            String email = reader.readLine();

            // Créer un objet Person à partir des données
            Person person = new Person(id, name, email);

            // Afficher l'objet désérialisé
            System.out.println("Objet désérialisé avec succès : " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/


        try {
            // Spécifiez le fichier texte contenant le JSON
            File file = new File("sarra.txt");

            // Initialisez l'ObjectMapper de Jackson
            ObjectMapper mapper = new ObjectMapper();

            // Lire le JSON et le convertir en un objet Person
            Person person = mapper.readValue(file, Person.class);

            // Afficher l'objet désérialisé
            System.out.println("Objet désérialisé avec succès : " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }




        File file = new File("user.json");

        // Création de l'ObjectMapper (Jackson)
       /* ObjectMapper mapper = new ObjectMapper();

        // Désérialisation du fichier JSON en objet User
        User user = mapper.readValue(file, User.class);

        // Afficher les données désérialisées
        System.out.println("ID : " + user.getId());
        System.out.println("Nom : " + user.getName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Roles : " + user.getRoles());
    } catch (Exception e) {
        e.printStackTrace();
    }*/

    }
}
