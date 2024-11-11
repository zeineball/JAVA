import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList extends ArrayList<Employe> implements IGestion<Employe> {

    List<Employe> employes = new ArrayList<>(10);

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        employes.sort(Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getDepartement)
                .thenComparing(Employe::getGrade));
    }
}

