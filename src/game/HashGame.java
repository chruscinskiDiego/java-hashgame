package game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class HashGame extends JFrame
{

    JButton[] button = new JButton[9];
    public boolean xo;

    boolean click[] = new boolean[9];


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
        winner();

    }

    public HashGame()
    {
        setVisible(true);
        setTitle("Hash Game by Diego Chruscinski");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(500,150,400,400);
        int cont = 0;



        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                button[cont] = new JButton();
                add(button[cont]);
                button[cont].setBounds((100 * i) + 40,(100 * j) + 30, 95,95);
                button[cont].setFont(new Font("Impact",Font.BOLD , 40));
                cont++;

            }
        }
        for(int i = 0; i < 9; i++)
        {
            click[i] = false;
        }

        button[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false)
                {
                    click[0] = true;
                    change(button[0]);
                }

            }
        });

        button[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false)
                {
                    click[1] = true;
                    change(button[1]);
                }

            }
        });
        button[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false)
                {
                    click[2] = true;
                    change(button[2]);
                }

            }
        });
        button[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false)
                {
                    click[3] = true;
                    change(button[3]);
                }

            }
        });
        button[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false)
                {
                    click[4] = true;
                    change(button[4]);
                }

            }
        });
        button[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false)
                {
                    click[5] = true;
                    change(button[5]);
                }

            }
        });
        button[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false)
                {
                    click[6] = true;
                    change(button[6]);
                }

            }
        });
        button[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false)
                {
                    click[7] = true;
                    change(button[7]);
                }

            }
        });
        button[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false)
                {
                    click[8] = true;
                    change(button[8]);
                }

            }
        });





    }

    public void winner()
    {
        int cont = 0;
        for(int i  = 0; i < 9; i++)
        {
            if(click[i] == true)
            {
                cont++;
            }
        }
        if((button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X")||
                (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X")||
                (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X")||
                (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X")||
                (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X")||
                (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X")||
                (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X")||
                (button[2].getText() == "X" && button[4].getText() == "X" && button[6].getText() == "X"))
        {
            JOptionPane.showMessageDialog(null,"X is the WINNER!");
            clean();
        }
        else if((button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O")||
                (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O")||
                (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O")||
                (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O")||
                (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O")||
                (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O")||
                (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O")||
                (button[2].getText() == "O" && button[4].getText() == "O" && button[6].getText() == "O"))
        {
            JOptionPane.showMessageDialog(null,"O is the WINNER!");
            clean();
        }
        else if(cont == 9){
            JOptionPane.showMessageDialog(null,"None of the players WON :/");
            clean();
        }
    }

    public void clean()
    {
        for(int i = 0; i < 9; i++)
        {
            button[i].setText("");
            click[i] = false;
        }
    }
}
