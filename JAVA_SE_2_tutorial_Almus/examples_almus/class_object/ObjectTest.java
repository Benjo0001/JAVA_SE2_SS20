public class ObjectTest{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = animal1; //auf gleiche Referenz zeigen wie animal1
        System.out.println(animal1.toString());
    
        animal1.setHasTeeth(true);
        animal1.setHasTeeth(false);
    
        if (animal1.equals(animal2){
            //.equals vergleicht nur ob die Referenz gleich ist , ob diese identisch sind
            System.out.println(animal1.toString());
        }else{
            System.out.println(animal1.toString());
        }

        if (animal3.equals(animal2){
            //.equals vergleicht nur ob die Referenz gleich ist , ob diese identisch sind
            System.out.println(animal1.toString());
        }else{
            System.out.println(animal1.toString());
        }

    } 
}