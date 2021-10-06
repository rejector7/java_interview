package basics.OOP;

public class ParentTest {
    private int value = 1;
    private void showValue(){
        System.out.println(value);
    }

    public void setValue(int value){
        showValue();
        this.value = value;
    }
}
