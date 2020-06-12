public class Audio implements Media {
    public Audio(){

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