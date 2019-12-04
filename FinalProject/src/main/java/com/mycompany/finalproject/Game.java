/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author micha
 */

enum Suit {
    DIAMONDS, HEARTS, CLUBS, SPADES;
}

class Card {
    
    private int value; //card integer value
    private String cardName;
    private Suit suit;
    public Card(int cardIndex, Suit suit) {
        
        this.value = setValue(cardIndex); // card index being the number to represent the card ex. Ace index = 1
        this.cardName = getName(cardIndex);
        this.suit = suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getName(int cardIndex) {
        
        switch (cardIndex) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return Integer.toString(cardIndex);
        }
    }
    
    public int setValue(int cardIndex) {
        
        if (cardIndex <= 9) {
            return cardIndex;
        }
        else {
            return 10;
        }
    }
    
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append(this.cardName);
        switch (suit) {
            case DIAMONDS:
                s.append("D");
                break;
            case CLUBS:
                s.append("C");
                break;
            case HEARTS:
                s.append("H");
                break;
            case SPADES:
                s.append("S");
                break;
            }
        return s.toString();
    }
    
}

class Deck {
    
    Random rand = new Random();
    private ArrayList<Card> deck = new ArrayList<>();
    public Deck() {
    
        buildDeck();
    }
    
    private void buildDeck() {
        
        for (Suit s : Suit.values()) {
            
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, s));
            }
        }
    }
    
    public Card hit() {
        
        int index = rand.nextInt(deck.size());
        Card c = deck.get(index);
        deck.remove(index);
        return c;
    }
}

class Player {
    
    ArrayList<Card> hand = new ArrayList<>();
    private int total = 0;
    public Player(Card c1, Card c2) {
        
        hand.add(c1);
        hand.add(c2);
        this.total = hand.get(0).getValue() + hand.get(1).getValue();
    }
    
    public int getTotal() {
        return this.total;
    }
    
    public void updateTotal(Card c) {
        this.total += c.getValue();
    }
    
    public void draw(Card c) {
        
        updateTotal(c);
        hand.add(c);
    }
    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        for (var c : hand) {
            
            s.append(c.toString());
            s.append(" ");
        }
        
        return s.toString();
    }
}

class BlackjackFrame extends JFrame implements ActionListener{
    
    private Player dealer, player;
    private Deck deck;
    private JPanel playerLabels, buttons;
    private JLabel dealerLabel, playerLabel;
    private JButton hitButton, stayButton;
    //Player dealer, player;
    public BlackjackFrame(String title) {
        deck = new Deck();
        dealer = new Player(deck.hit(), deck.hit());
        player = new Player(deck.hit(), deck.hit());
        
        this.setTitle(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Initialize top labels in frame
        dealerLabel = new JLabel("Dealer: ??", JLabel.CENTER);
        playerLabel = new JLabel("Player: " + player.getTotal(), JLabel.CENTER);
        playerLabels = new JPanel(new GridLayout(1, 2));
        playerLabels.add(dealerLabel);
        playerLabels.add(playerLabel);
        this.add(playerLabels, BorderLayout.NORTH);
        
        //Initialize buttons at bottom of frame
        buttons = new JPanel(new FlowLayout());
        hitButton = new JButton("HIT");
        hitButton.addActionListener(this);
        stayButton = new JButton("STAY");
        stayButton.addActionListener(this);
        buttons.add(hitButton);
        buttons.add(stayButton);
        this.add(buttons, BorderLayout.SOUTH);
        
        
        this.setVisible(true);
    }
    
    public void closeWindow() {
        
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
       if (event.getSource() == hitButton) {
                player.draw(deck.hit());
                playerLabel.setText("Player: " + player.getTotal());
                playerLabel.revalidate();
                playerLabels.revalidate();
                if (player.getTotal() > 21) {
                    JOptionPane.showMessageDialog(this,
                "You went over 21!");
                    this.closeWindow();
                }
                //addCardToScreen();
            }
       else if(event.getSource() == stayButton) {
           
           while (dealer.getTotal() < 17) {
               dealer.draw(deck.hit());
           }
           dealerLabel.setText("Dealer: " + dealer.getTotal());
           dealerLabel.revalidate();
           playerLabels.revalidate();
           if (dealer.getTotal() > 21) {
               JOptionPane.showMessageDialog(this,
                "The dealer went over 21!");
               this.closeWindow();
           }
       }

    }
}
public class Game {

    
    public static void main(String[] args) {
      BlackjackFrame blackjack = new BlackjackFrame("Blackjack");
    }
    
}
