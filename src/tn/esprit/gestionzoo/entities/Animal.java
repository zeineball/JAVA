public class Animal {
    private String name;
    private int age;
    private String Family;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal){
        if(age<0){
            System.out.println("Invalid Age");
            return;
        }
        this.Family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getFamily(){
        return Family;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    boolean isMammal(){
        return isMammal;
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
