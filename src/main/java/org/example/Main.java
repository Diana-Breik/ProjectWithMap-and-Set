package org.example;

//Schritt 1: Erstellt eine Klasse '' mit den Methoden 'getName', 'getPrice' und 'getAvailability'.
//Schritt 2: Lege eine Java-Klasse 'Apotheke' an, die eine Java-Map verwendet, um den Medication Namen als Schlüssel und deren Informationen als Werte zu speichern. Implementiere Methoden, um Medication zur Map hinzuzufügen, Informationen abzurufen und die Verfügbarkeit zu aktualisieren.
//Schritt 3: Lege eine Methode 'int getCount()' in der Klasse `Apotheke` an. Diese Methode sollte die Anzahl der Medication in der Apotheke zurückgeben.
//Schritt 4: Lege eine Methode 'void save(Medication medication)' in der Klasse `Apotheke` an. Diese Methode sollte das Medication indexiert nach seinem Namen in die Apotheke einfügen.
//Schritt 5: Lege eine Methode 'Medication find(String medicationName)' in der Klasse `Apotheke` an. Diese Methode sollte die gesuchte Medication mit diesem Namen zurückgeben. Falls keine Medication mit diesem Namen gefunden wird, sollte die Methode null zurückgeben.
//Schritt 6: Lege eine Methode 'void delete(String medicationName)' in der Klasse `Apotheke` an. Diese Methode sollte die Medication mit diesem Namen löschen.
//Schritt 7: Implementiere eine Methode, um alle Medication in der Map auszugeben, einschließlich ihres Namens, Preises und der Verfügbarkeit.
public class Main {
    public static void main(String[] args) {
        Apotheke apotheke1 = new Apotheke();

        Medikament m1 = new Medikament("Vitamin C",20,true);
        Medikament m2 = new Medikament("Vitamin B",22,true);

        apotheke1.addMedication(m1);
        apotheke1.addMedication(m2);

        apotheke1.printAllMedications();//Vitamin C & B
        apotheke1.delete("Vitamin B");
        apotheke1.printAllMedications();//Vitamin C

        apotheke1.addMedication(new Medikament("Vitamin D",40,true));
        apotheke1.printAllMedications();//Vitamin C & D

        System.out.println(apotheke1.getCount());//2

        System.out.println(apotheke1.find("Vitamin D"));

    }
}