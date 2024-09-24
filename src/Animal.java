public class Animal {
    String name;
    int age;
    String Family;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal){
        this.Family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    void displayAnimal(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Family: " + Family);
        if(isMammal){
            System.out.println("Mammal");
        }else{
            System.out.println("Not Mammal");
        }
    }
//commit bl s7i7
}
