package com.zubkov;

import javax.swing.*;
import java.awt.*;

public class ScoreTable extends JFrame {

    private JLabel score = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private JLabel lastScorer = new JLabel("Last scorer: N/A", SwingConstants.CENTER);
    private JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    private int scoreMilan = 0;
    private int scoreRealMadrid = 0;

    private ScoreTable(String name, int width, int height) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //labels&buttons
        setLayout(new BorderLayout());
        setSize(width, height);
        JButton btnMilan = new JButton("AC Milan");
        add(btnMilan, BorderLayout.WEST);
        JButton btnRM = new JButton("Real Madrid");
        add(btnRM, BorderLayout.EAST);
        add(lastScorer, BorderLayout.NORTH);
        add(winner, BorderLayout.SOUTH);
        add(score, BorderLayout.CENTER);

        //appearance
        Font fnt = new Font("Times new roman", Font.BOLD, 25);
        score.setFont(fnt);
        lastScorer.setFont(fnt);
        winner.setFont(fnt);
        btnMilan.setBackground(Color.BLACK);
        btnMilan.setForeground(Color.RED);
        btnMilan.setFont(fnt);
        btnMilan.setPreferredSize(new Dimension(200, 30));
        btnRM.setBackground(Color.YELLOW);
        btnRM.setPreferredSize(new Dimension(200, 30));
        btnRM.setFont(fnt);
        setVisible(true);

        //Listeners
        btnMilan.addActionListener(e -> {
            score.setText("Result: " + ++scoreMilan + " X " + scoreRealMadrid);
            lastScorer.setText("Last scorer: " + "AC Milan");
            if (scoreMilan > scoreRealMadrid)
                winner.setText("Winner: AC Milan");
            else if (scoreMilan == scoreRealMadrid)
                winner.setText("Winner: DRAW");
        });

        btnRM.addActionListener(e -> {
            score.setText("Result: " + scoreMilan + " X " + (++scoreRealMadrid));
            lastScorer.setText("Last scorer: " + "Real Madrid");
            if (scoreMilan < scoreRealMadrid)
                winner.setText("Winner: Real Madrid");
            else if (scoreMilan == scoreRealMadrid)
                winner.setText("Winner: DRAW");
        });
    }

    public static void main(String[] args) {
        new ScoreTable("MyFrame", 600, 150);
    }
}
