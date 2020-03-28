package graph;
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
        Personne(String nom, double degre_malade, int age, String maladies_courantes){
            this.nom=nom; this.degre_malade= degre_malade; this.age=age; this.maladies_courantes=maladies_courantes;
        }
    }
    private void condition_contamination(){
         double sum = 0;
         for(Personne personne : noeux_associer){
             sum += personne.degre_malade;
         }
         if(root.degre_malade<sum){has_covid_19=true;}
    }

    public static void main(String[] args){
        GraphList graph = new GraphList();
        Personne p1 = new Personne("p1", 0.3, 14, "");
        Personne p2 = new Personne("p2", 0.6, 14, "");
        Personne p3 = new Personne("p3", 0.8, 14, "");
        Personne p4 = new Personne("p4", 0.9, 14, "");

        graph.root=p1;
        graph.noeux_associer.add(p2); graph.noeux_associer.add(p3);

    }
}
