public class MoneyOperations {
    public static void main(String[] args) {

        money mon = new money(300 ,200);
        System.out.println("Sum" + mon.sum());
        System.out.println("Comparison" + mon.comparison());
        System.out.println("Subtraction" + mon.subtraction());


    }

    public static class money{
        private int money1;
        private int money2;

        public money(int money1, int money2){
            this.money1 = money1;
            this.money2 = money2;
        }

        public int sum(){
            return money1 + money2;
        }

        public int comparison(){
            if(money1 > money2){
                System.out.println("Money1 is greater");
                return money1 ;
            }else{
                System.out.println("Money2 is greater");
                return money2;
            }
        }
        public int subtraction() {
            int value = money1 - money2;

            if (value < 0) {
                System.out.println("No negative values allowed");
                return 0;
            }

            return value;
        }
    }
}
