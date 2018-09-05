package prueba2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.animation.PauseTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author Axel Reyez
 */
public class reloj extends Thread {

    private Label lbl;

    public reloj(Label lbl) {
        this.lbl = lbl;
    }

    @Override
    public void run() {
        while (true) {
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
            lbl.setText(s.format(hoy));
            PauseTransition pausa = new PauseTransition(Duration.millis(1000));
            pausa.play();
        }

    }
}

