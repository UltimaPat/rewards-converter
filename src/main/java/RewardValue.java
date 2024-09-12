public class RewardValue {
    double cash;
    double miles;

    public RewardValue(double c) {
        this.cash = c;
        this.miles = 0;
    }

    public RewardValue(double c, double m) {
        this.cash = c;
        this.miles = m;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }

    public double rewardConvert(){
        cash = miles * 0.0035;
        return cash;
    }

    public static void main(String[] args) {


    }

}
