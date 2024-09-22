package EnumsCollections;

public class TransportModified {
    enum Transport{
        TRAIN(120), PLANE(300), AUTOMOBILE(60);

        int speed;
        Transport(int s){
            speed = s;
        }
    }
    public static void main(String[] args) {
        Transport tp = Transport.AUTOMOBILE;

        System.out.println("The speed of an automibile is:" +Transport.AUTOMOBILE.speed);

        if(tp.ordinal()< 2){
            System.out.println("Not an automobile");

        }

    }
}
