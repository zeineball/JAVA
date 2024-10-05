public class Zoo {
    private String name;
    private String City;
    final int nbrCages=25;
    private int i=0;// nbr animals
    private Animal[] animals;
    public Zoo(String name, String City) {
        if(name==null){
            System.out.println("Name is null");
            return;
        }
        animals = new Animal[nbrCages];
        this.name = name;
        this.City = City;

    }
    String getName(){
        return name;
    }
    String getCity(){
        return City;
    }
    Animal[] getAnimals(){
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayZoo(){
        System.out.println(name + " " + City + " " + "nombre cages " + i +" .");
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+ "= " + name + " " + City + " " + i + ".";
    }

    boolean addAnimal(Animal a){
        if(isZooFull() || searchAnimal(a)!=-1){
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
            if(a.getName().equals(animals[j].getName())){
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
//commit bl s7i7


}
