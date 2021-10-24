package effective_java.chapter7;

import java.util.function.*;

public class Principal44FunctionInterface{

    public static void main(String[] args) {
        FunctionInterfaceTest functionInterfaceTest = info -> System.out.println(info);
//        FunctionInterfaceTest functionInterfaceTest = System.out :: println;
        functionInterfaceTest.getInfo("Hello Functional Interface");
        BiFunction<String, Integer, Double> biFunction = new BiFunction<String, Integer, Double>() {
            @Override
            public Double apply(String s, Integer integer) {
                return (double)s.length() + integer;
            }
        };
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = new ToDoubleBiFunction<Integer, Integer>() {
            @Override
            public double applyAsDouble(Integer integer, Integer integer2) {
                return 0;
            }
        };
        LongFunction<Integer> longFunction = new LongFunction<Integer>() {
            @Override
            public Integer apply(long value) {
                return null;
            }
        };
        LongToIntFunction longToIntFunction = new LongToIntFunction() {
            @Override
            public int applyAsInt(long value) {
                return 0;
            }
        };
        IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return false;
            }
        };
    }
}

@FunctionalInterface
interface FunctionInterfaceTest{
    void getInfo(String info);
}
