package java.initializer;

import java.util.Scanner;
import java.view.MenusView;

public class Init {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("                  <>_FINANCE_CONTROL_<>                      ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        MenusView.menuEntrada(r);
        r.close();
    }
}
