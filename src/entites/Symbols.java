package entites;

import javax.swing.*;

public class Symbols {

    public boolean xo;

    public void change(JButton button)
    {
        if(xo)
        {
            button.setText("O");
            xo = false;
        }
        else
        {
            button.setText("X");
            xo = true;
        }
    }
}
