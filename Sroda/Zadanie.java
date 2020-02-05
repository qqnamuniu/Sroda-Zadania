package Sroda;

public class Zadanie {
    public static void main(String [] args) {
        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

        int index = 0;
        for (;;) {
            if (index <months.length) {
                System.out.println(months[index]);
                index++;
            } else {
                break;
            }
        }
    }
}
