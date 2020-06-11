class Cloning {
    public static void main(String[] args){

        /*
        - TYPES
        1. Shallow
        2. Deep
        3. Clone
        */

        // Shallowing (just reference to the object with new address)
        Abc obj = new Abc();
        obj.i=5;
        obj.j=6;

        Abc obj2 = obj;
       
         
        

        // Deep Shallowing (pick each individual item and copy)
        Abc obj3 = new Abc();
        obj3.i = obj.i;
        obj3.j = obj.j;



        // change values and output:
        obj.i=6;
        obj.j=8;
        obj3.j = 10;
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
        
    }
}

// shallowing
class Abc {
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{"+"i="+i+", j="+j+"}";
    }
}

