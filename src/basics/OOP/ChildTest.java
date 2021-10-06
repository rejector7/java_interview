package basics.OOP;

public class ChildTest extends ParentTest{

    @Override
    public void setValue(int value) {
        super.setValue(value + 1);
    }
}
