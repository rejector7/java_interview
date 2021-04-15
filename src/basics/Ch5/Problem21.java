package basics.Ch5;



public class Problem21 {
    public Problem21() {
        for (Money_TYPE money:Money_TYPE.values()){
            System.out.print(money.ordinal() + " ");
        }
    }
}

enum Money_TYPE {
    MIN, MIN_SECOND, MIDDEL, MIDDEL_HIGH, HIGH, SUPER_HIGH
}