package java.model;

import java.util.List;

public class Materials extends Course{
     private int idMaterial;
     private float record;
     private Homework listOfHomework;
     private List<Examen> ListOfExamen;

     public Materials(int title, int idDegree) {
          super(title, idDegree);
     }
}
