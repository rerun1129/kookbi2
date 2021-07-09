package reservationD.run;

import reservationD.view.Menu;

public class Main {

    public void play(){
        Menu info = new Menu();
        info.commandLine();
    }
    public static void main(String[] args) {
        Main app = new Main();
        app.play();
    }

}
