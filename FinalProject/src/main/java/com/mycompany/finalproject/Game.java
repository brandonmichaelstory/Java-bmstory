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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author micha
 */
class BlackjackFrame extends JFrame implements ActionListener{
    
    private Player dealer, player;
    private Deck deck;
    private JPanel playerLabels, buttons, cardPanel, dealerCards, playerCards;
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
        this.setLocationRelativeTo(null);
        
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
        
        // Initialize panels for cards
        cardPanel = new JPanel(new GridLayout(1, 2));
        dealerCards = new JPanel(new GridLayout(3, 4));
        playerCards = new JPanel(new GridLayout(3, 4));
        showStartingHands();
        cardPanel.add(dealerCards);
        cardPanel.add(playerCards);
        this.add(cardPanel, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    public void closeWindow() {
        
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
       if (event.getSource() == hitButton) {
            
           addCardToScreen();
            if (player.getTotal() > 21) {
                JOptionPane.showMessageDialog(this, "You went over 21! YOU LOSE!");
                this.closeWindow();
                }
            
       }
       else if(event.getSource() == stayButton) {
           
           dealerTurn();
           if (dealer.getTotal() > 21) {
               JOptionPane.showMessageDialog(this, "The dealer went over 21! YOU WIN!");
               this.closeWindow();
           }
           else if (dealer.getTotal() > player.getTotal()) {
               JOptionPane.showMessageDialog(this, "The dealer was closer to 21! YOU LOSE!");
               this.closeWindow();
           }
           else if (dealer.getTotal() < player.getTotal()) {
               JOptionPane.showMessageDialog(this, "You were closer to 21! YOU WIN!");
               this.closeWindow();
           }
           else if (dealer.getTotal() == player.getTotal()) {
               JOptionPane.showMessageDialog(this, "You and the dealer tied!");
               this.closeWindow();
           }
       }
    }
    
    public void showStartingHands() {
        
        BufferedImage cardPicture;
        Card pc1 = this.player.hand.get(0);
        Card pc2 = this.player.hand.get(1);
        Card dc1 = this.dealer.hand.get(0);
        try {
            cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\" + pc1.toString() + "Small.PNG"));
            playerCards.add(new JLabel(new ImageIcon(cardPicture)));
            cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\" + pc2.toString() + "Small.PNG"));
            playerCards.add(new JLabel(new ImageIcon(cardPicture)));
            playerCards.revalidate();
            cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\" + dc1.toString() + "Small.PNG"));
            dealerCards.add(new JLabel(new ImageIcon(cardPicture)));
            cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\Unknown.PNG"));
            dealerCards.add(new JLabel(new ImageIcon(cardPicture)));
            dealerCards.revalidate();
            cardPanel.revalidate();
        } catch (IOException ex) {
            Logger.getLogger(BlackjackFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void addCardToScreen() {
        player.draw(deck.hit());
        Card c = player.hand.get(player.hand.size()- 1);
        playerLabel.setText("Player: " + player.getTotal());
        playerLabel.revalidate();
        playerLabels.revalidate();
        BufferedImage cardPicture;
        try {
            cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\" +c.toString() + "Small.PNG"));
            playerCards.add(new JLabel(new ImageIcon(cardPicture)));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void dealerTurn() {
        
        while (dealer.getTotal() < 17) {
            dealer.draw(deck.hit());
        }
        dealerCards.removeAll();
        for (var c : dealer.hand) {
            BufferedImage cardPicture;
            try {
                cardPicture = ImageIO.read(new File("C:\\Users\\micha\\Desktop\\BlackjackCards\\" + c.toString() + "Small.PNG"));
                dealerCards.add(new JLabel(new ImageIcon(cardPicture)));
            } catch (IOException ex) {
                Logger.getLogger(BlackjackFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dealerLabel.setText("DEALER: " + dealer.getTotal());
        dealerLabel.revalidate();
        dealerCards.revalidate();
        cardPanel.revalidate();
    }
}
public class Game {

    
    public static void main(String[] args) {
      BlackjackFrame blackjack = new BlackjackFrame("Blackjack");
    }
    
}
