package effective_java.chapter3;

import java.util.Objects;

public class Principal11Hashcode {
    private int phoneNumber;

    public Principal11Hashcode(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(! (obj instanceof Principal11Hashcode)) return false;
        Principal11Hashcode ph = (Principal11Hashcode) obj;
        return ph.phoneNumber == this.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    public static void main(String[] args) {
        Principal11Hashcode pe = new Principal11Hashcode(1233);
        System.out.println(pe.equals(new Principal11Hashcode(1233)));
        System.out.println(pe.hashCode() == new Principal11Hashcode(1233).hashCode());
    }
}
