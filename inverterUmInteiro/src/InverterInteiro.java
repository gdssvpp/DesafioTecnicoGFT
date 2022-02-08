import java.util.Scanner;

public class InverterInteiro {
    public static void main(String[] args) {
        System.out.println(inverter(15485448, 0));
        System.out.println(inverter(2195498, 0));
        System.out.println(inverter(12, 0));
        System.out.println(inverter(98716549, 0));
        //System.out.println(inverter(9999998999d, 0));
        System.out.println(inverter(1654891, 0));
    }

    private static int inverter(int n, int total){
        if (n == 0)
            return total;
        else return inverter(n / 10, total * 10 + n% 10);
    }
}
