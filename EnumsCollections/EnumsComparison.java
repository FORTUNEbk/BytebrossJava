s Operations "package EnumsCollections;

public class EnumsComparison {
    enum Transport{
        TRAIN, PLANE, AUTOMOBILE;
    }

    public static void main(String[] args) {
        Transport tp1 = Transport.AUTOMOBILE;
        Transport tp2 = Transport.AUTOMOBILE;

        if(tp1 == tp2){
            System.out.println("Both transports are the same");
        } else {
            System.out.println("Both transports are different");
        }

        Transport tp3 = Transport.TRAIN;
        switch(tp3){
            case TRAIN:
                System.out.println("This is a train");
                break;
            case PLANE:
                System.out.println("This is a plane");
                break;
            case AUTOMOBILE:
                System.out.println("This is an automobile");
                break;
        }
    }
}