package effective_java.chapter2;

public class Principal02Builder {
    private final String sex;
    private final String name;
    private final int age;

    private static class Builder{
        //required
        private final String sex;
        //optional
        private String name = "";
        private int age = 0;

        public Builder(String sex){
            this.sex = sex;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Principal02Builder build(){
            return new Principal02Builder(this);
        }
    }

    private Principal02Builder(Builder builder){
        this.sex = builder.sex;
        this.name = builder.name;
        this.age = builder.age;
    }

    public void Hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Principal02Builder pb = new Principal02Builder.Builder("boy").age(10).name("ruanjinteng").build();
        pb.Hello();
    }
}
