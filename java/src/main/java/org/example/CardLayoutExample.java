package org.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));

        cards.add(card1, "Card1");
        cards.add(card2, "Card2");

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.next(cards));

        frame.setLayout(new BorderLayout());
        frame.add(cards, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
