public class Picture implements Media {
    
    public Picture(){

    }

    @Override
    public void play(){
        String name = "play";
        String package = "/u13";
        System.out.println("Klassenname: " + name + "und package: "+ package)
    }
    @Override
    public void stop(){
        String name = "stop";
        String package = "/u13";
        System.out.println("Klassenname: " + name + "und package: "+ package)

    }
    @Override
    public void display(){
        String name = "display";
        String package = "/u13";
        System.out.println("Klassenname: " + name + "und package: "+ package)
    }
}