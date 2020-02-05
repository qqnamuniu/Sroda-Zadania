package Sroda;

public class Litery {
    public static void main(String [] args) {
        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        int index = 0;
        System.out.println("Nazwy miesiecy: ");

        while (index < months.length) {
            System.out.println(months[index]);
            index++;
        }
        System.out.println("Nazwy tam z 4 cos: ");
        for (String months1 : months) {
            if (months1.length() >= 4) {
                System.out.println(months1);
            } else {
                break;
            }
        }
    }
}
