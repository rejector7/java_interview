package effective_java.chapter3;

/**
 * test phone number equals
 */
public class Principal10Equals {
    private int phoneNumber;

    public Principal10Equals(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(! (obj instanceof Principal10Equals)) return false;
        Principal10Equals pe = (Principal10Equals) obj;
        return pe.phoneNumber == this.phoneNumber;
    }

    public static void main(String[] args) {
        Principal10Equals pe = new Principal10Equals(1233);
        System.out.println(pe.equals(new Principal10Equals(1233)));
    }

}
