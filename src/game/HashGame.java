package game;
import entites.Symbols;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class HashGame extends JFrame
{

    JButton[] button = new JButton[9];
    Symbols symbols = new Symbols();
    public HashGame()
    {
        setVisible(true);
        setTitle("Hash Game by Diego Chruscinski");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(500,150,700,500);
        int cont = 0;
        boolean click[] = new boolean[9];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                button[cont] = new JButton();
                add(button[cont]);
                button[cont].setBounds((100 * i) + 50,(100 * j) + 50, 95,95);
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
                    symbols.change(button[0]);
                }

            }
        });

        button[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false)
                {
                    click[1] = true;
                    symbols.change(button[1]);
                }

            }
        });
        button[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false)
                {
                    click[2] = true;
                    symbols.change(button[2]);
                }

            }
        });
        button[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false)
                {
                    click[3] = true;
                    symbols.change(button[3]);
                }

            }
        });
        button[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false)
                {
                    click[4] = true;
                    symbols.change(button[4]);
                }

            }
        });
        button[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false)
                {
                    click[5] = true;
                    symbols.change(button[5]);
                }

            }
        });
        button[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false)
                {
                    click[6] = true;
                    symbols.change(button[6]);
                }

            }
        });
        button[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false)
                {
                    click[7] = true;
                    symbols.change(button[7]);
                }

            }
        });
        button[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false)
                {
                    click[8] = true;
                    symbols.change(button[8]);
                }

            }
        });

    }
}
