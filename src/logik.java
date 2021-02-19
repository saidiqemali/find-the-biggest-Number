
public class logik {

    public static void main(String[] args) {

        double n1 = -17.5, n2 = 13.9, n3 = 56.5;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " ist die grösste Zahl.");
            else
                System.out.println(n3 + " ist die grösste Zahl.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " ist die grösste Zahl.");
            else
                System.out.println(n3 + " ist die grösste Zahl.");
        }
    }
}
