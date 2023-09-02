package org.example;

import java.util.HashMap;
import java.util.Map;

//Schritt 2: Lege eine Java-Klasse 'Apotheke' an, die eine Java-Map verwendet, um den Medication Namen als Schlüssel und deren Informationen als Werte zu speichern. Implementiere Methoden, um Medication zur Map hinzuzufügen, Informationen abzurufen und die Verfügbarkeit zu aktualisieren.
public class Apotheke {
    private Map<String,Medikament> map = new HashMap<>();

    //Methode um Medication zur Map hinzuzufügen//save
    public void addMedication(Medikament newMedicat){
       map.put(newMedicat.getName(), newMedicat);
    }


    //Methode um die Anzahl der Medication in der Apotheke zurückzugeben.
    public int getCount(){
        return map.size();
    }

    //Methode um die gesuchte Medication mit dem Namen zurückzugeben.
    public Medikament find(String medicationName){
        return map.get(medicationName);
    }

    //Methode um die Medication mit dem Namen zu löschen.
    public void delete(String medicationName){
        map.remove(medicationName);
    }

    //Methode um alle Medication in der Map auszugeben, einschließlich ihres Namens, Preises und der Verfügbarkeit.
    public void printAllMedications(){
        System.out.println(map);
        /*
        for(Medikament item : map.values()){
            item.toString();
        }
         */
    }

}
