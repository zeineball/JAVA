public class Main {
    public static void main(String[] args) {
        Animal test= new Animal("oiseau","perruche",6,false);
        Animal test2= new Animal("oiseau","perruche",6,false);
        Animal a = new Animal("felin","lion",10,true);
        Animal a1= new Animal("poisson","dorade",1,false);
        Animal a2= new Animal("oiseau","perruche",6,false);
        Zoo z = new Zoo("belvedere","tunis",10);
        /*z.displayZoo();
        System.out.println(z);
        System.out.println(z.toString());
        a.displayAnimal();*/
        z.addAnimal(a);
        z.addAnimal(a1);
        z.addAnimal(a2);
        System.out.println(z.addAnimal(test2));
        z.showAnimals();
        System.out.println(z.searchAnimal(test));


        /*boolean ajout=z.addAnimal(a);
        if(ajout){
            System.out.println("Ajout avec succée");
        }*/
    }
}
