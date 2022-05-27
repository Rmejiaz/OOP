/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tallerexcepciones;


import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 *
 * @author rafael
 */
public class Punto8 extends JFrame implements ActionListener{

 private double[] a = {1,2};
 private JRadioButton divideByZeroButton;

 private JRadioButton badCastButton;

 private JRadioButton arrayBoundsButton;

 private JRadioButton nullPointerButton;

 private JRadioButton negSqrtButton;

 private JRadioButton overflowButton;

 private JRadioButton noSuchFileButton;

 private JRadioButton throwUnknownButton;

 public Punto8() {
    // Create a JPanel and GridLayout
 JPanel p = new JPanel();
 p.setLayout(new GridLayout(8, 1));

 // Create buttons and add them to the panel
 ButtonGroup g = new ButtonGroup();
 divideByZeroButton = addRadioButton("Divide by zero", g, p);
 badCastButton = addRadioButton("Bad cast", g, p);
 arrayBoundsButton = addRadioButton("Array bounds", g, p);
 nullPointerButton = addRadioButton("Null pointer", g, p);
 negSqrtButton = addRadioButton("sqrt(-1)", g, p);
 overflowButton = addRadioButton("Overflow", g, p);
 noSuchFileButton = addRadioButton("No such file", g, p);
 throwUnknownButton = addRadioButton("Throw unknown", g, p);
 getContentPane().add(p);
 }
 
 private JRadioButton addRadioButton(String s, ButtonGroup g, JPanel p) {
 JRadioButton button = new JRadioButton(s, false);
 button.addActionListener(this);
 g.add(button);
 p.add(button);
 return button;
 }
 
 // Trigger and catch various exceptions
 public void actionPerformed(ActionEvent evt) {
 try {
 Object source = evt.getSource();
 if (source == divideByZeroButton) {
 a[1] = a[1] / (a[1] - a[1]);
 } else if (source == badCastButton) {
 Frame f = (Frame) evt.getSource();
 } else if (source == arrayBoundsButton) {
 a[1] = a[10];
 } else if (source == nullPointerButton) {
 Frame f = null;
 f.setSize(200, 200);
 } else if (source == negSqrtButton) {
 a[1] = Math.sqrt(-1);
 } else if (source == overflowButton) {
 a[1] = 1000 * 1000 * 1000 * 1000;
 int n = (int) a[1];
 } else if (source == noSuchFileButton) {
 FileInputStream is = new FileInputStream("Java Source and Support");
 } else if (source == throwUnknownButton) {
 throw new UnknownError();
 }
 } catch(ArithmeticException e){
 System.out.println("Caught ArithmeticException: " + e);
 }catch(ClassCastException e){
     System.out.println("Caught ClassCastException: "+e);
 }catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Caught ArrayIndexOutOfBoundsException: "+e);
 }catch(NullPointerException e){
     System.out.println("Caught NullPointerException: "+e);
 }catch(FileNotFoundException e){
     System.out.println("Caught FileNotFoundException: "+e);
 }catch(UnknownError e){
     System.out.println("Caught an UnknownError: "+e);
 }
 catch (RuntimeException e) {
 System.out.println("Caught RuntimeException: " + e);
 } catch (Exception e) {
 System.out.println("Caught Exception: " + e);
 }
 }

 public static void main(String[] args) {
 JFrame frame = new Punto8();
 frame.setSize(150, 200);
 frame.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 frame.setVisible(true);
 }
}
 

