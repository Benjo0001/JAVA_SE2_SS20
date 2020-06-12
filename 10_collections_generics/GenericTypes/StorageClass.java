//                      <T, T2> für type -> data type of this variable
public class StorageClass <T, T2>{
    
    // private int storage;

    // public StorageClass(int dataToSafe){
    //     setStorage(dataToSafe);
    // }

    // public int getStorage() {
    //     return storage;
    // }
    // public void setStorage(int storage) {
    //     this.storage = storage;
    // }


    // jetzt generische Typen -> Typvariablen
    private T storage;
    private T2 storage2;
    private int zahl;

    public StorageClass(T s1, T2 s2, int z1){
        setStorage(s1);
        setStorage2(s2);
        setZahl(z1);
    }

    public T getStorage() {
        return storage;
    }
    public T2 getStorage2() {
        return storage2;
    }
    public int getZahl() {
        return zahl;
    }

    public void setStorage(T storage) {
        this.storage = storage;
    }
    public void setStorage2(T2 storage2) {
        this.storage2 = storage2;
    }
    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}