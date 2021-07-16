package ATM.Run;

import ATM.view.Menu;

public class Main {

    public static void main(String[] args) {

        Menu app = new Menu();
        try {
            app.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
