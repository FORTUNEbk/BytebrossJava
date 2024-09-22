package EnumsCollections;

public class Enums {
    enum Transport{
        TRAIN, PLANE, AUTOMOBILE;
    }
    public static void main(String[] args) {
        Transport tp = Transport.AUTOMOBILE;

        if(tp == Transport.AUTOMOBILE){
            System.out.println("Something");
        }
        System.out.println("Not equal");

    }
}
