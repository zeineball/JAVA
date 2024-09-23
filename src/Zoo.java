public class Zoo {
    String name;
    String City;
    int nbrCages;
    static int i=0;
    Animal[] animals;
    public Zoo(String name, String City, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.City = City;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println(name + " " + City + " " + nbrCages + ".");
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "= " + name + " " + City + " " + nbrCages + ".";
    }

    boolean addAnimal(Animal a){
        if(i==nbrCages || searchAnimal(a)!=-1){
            return false;
        }
        animals[i] = a;
        i++;
        return true;
    }
    void showAnimals(){
        for(Animal i : animals){
            System.out.println(i);
        }
    }

    int searchAnimal(Animal a){
        for(int j=0;j<i;j++){
            if(a.name.equals(animals[j].name)){
                return j;
            }
        }
        return -1;
    }
}
