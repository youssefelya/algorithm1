import java.util.ArrayList;
import java.util.List;

public class GraphList {
    Personne root;
        private List<Personne> noeux_associer = new ArrayList<>();
        private boolean has_covid_19;

    private static class Personne{
        String nom;
        private double degre_malade;
        private int age;
        private String maladies_courantes;
        Personne ami ;
    }
    private void condition_contamination(){
         double sum = 0;
         for(Personne personne : noeux_associer){
             sum += personne.degre_malade;
         }
         if(root.degre_malade<sum){has_covid_19=true;}
    }
}
