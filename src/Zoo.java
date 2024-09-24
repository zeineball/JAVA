public class Zoo {
    String name;
    String City;
    final int nbrCages=25;
    int i=0;
    Animal[] animals;
    public Zoo(String name, String City) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.City = City;
        //this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println(name + " " + City + " " + "nombre cages " + i +" .");
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "= " + name + " " + City + " " + i + ".";
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
        for (Animal animal : animals) {
            System.out.println(animal);
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

    boolean removeAnimal(Animal a){
        int index = searchAnimal(a);
        if(index!=-1){
            animals[index] = animals[index+1];
            return true;
        }
        return false;
    }

    boolean isZooFull(){
        return i == nbrCages-1;
    }

    static Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.i>=z2.i){
            return z1;
        }else {
            return z2;
        }
    }


}
