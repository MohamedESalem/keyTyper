package keytyper;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KeyTyper {

    static FileReader fr;
    static FileReader fr2;
    static BufferedReader br;
    static FileWriter fw;
    static Robot rb;
    static int read;
    static char c;
    static int speed = 30; //Type speed by milisecondes 110'nature'
    static boolean capState; //caps lock state
    static String line;
    //static boolean lock = false; // to get the state of a key and start typing or stop

    public static void main(String[] args) {

        try {
            fr = new FileReader("log.properties");
            fr2 = new FileReader("race.txt");
            br = new BufferedReader(fr2);
            fw = new FileWriter("log.properties");
            rb = new Robot();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            System.out.println("the action will start in 3");
            Thread.sleep(1000);
            System.out.println("the action will start in 2");
            Thread.sleep(1000);
            System.out.println("the action will start in 1");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                fw.write(line + " \n");

                line = br.readLine();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                br.close();
                fw.close();
                fr2.close();
            } catch (IOException ex) {
                Logger.getLogger(KeyTyper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

////////////////////////////////////////////////////////////////////////////////
        //start checking the capslock state
        capState = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);

        if (capState == false) {//check the capslock state

        } else if (capState == true) {
            rb.keyPress(KeyEvent.VK_CAPS_LOCK);
            rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
        }
        //end checking the capslock state
        try {
            read = fr.read();

            while (read != -1) {
                
                    if (read >= 65 && read <= 90) {//this is the range of capital leters
                        rb.keyPress(KeyEvent.VK_SHIFT);//turn on capslock

                        rb.keyPress(read);
                        rb.delay(speed);// write speed by milisecondes
                        rb.keyRelease(read);

                        rb.keyRelease(KeyEvent.VK_SHIFT);//turn off capslock

                    } else if (read >= 97 && read <= 122) {//this is the range of small leters

                        switch (read) {//switch on all the small charecters to type it
                            case 97:
                                rb.keyPress(KeyEvent.VK_A);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_A);
                                break;

                            case 98:
                                rb.keyPress(KeyEvent.VK_B);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_B);
                                break;

                            case 99:
                                rb.keyPress(KeyEvent.VK_C);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_C);
                                break;

                            case 100:
                                rb.keyPress(KeyEvent.VK_D);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_D);
                                break;

                            case 101:
                                rb.keyPress(KeyEvent.VK_E);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_E);
                                break;

                            case 102:
                                rb.keyPress(KeyEvent.VK_F);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_F);
                                break;

                            case 103:
                                rb.keyPress(KeyEvent.VK_G);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_G);
                                break;

                            case 104:
                                rb.keyPress(KeyEvent.VK_H);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_H);
                                break;

                            case 105:
                                rb.keyPress(KeyEvent.VK_I);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_I);
                                break;

                            case 106:
                                rb.keyPress(KeyEvent.VK_J);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_J);
                                break;

                            case 107:
                                rb.keyPress(KeyEvent.VK_K);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_K);
                                break;

                            case 108:
                                rb.keyPress(KeyEvent.VK_L);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_L);
                                break;

                            case 109:
                                rb.keyPress(KeyEvent.VK_M);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_M);
                                break;

                            case 110:
                                rb.keyPress(KeyEvent.VK_N);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_N);
                                break;

                            case 111:
                                rb.keyPress(KeyEvent.VK_O);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_O);
                                break;

                            case 112:
                                rb.keyPress(KeyEvent.VK_P);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_P);
                                break;

                            case 113:
                                rb.keyPress(KeyEvent.VK_Q);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_Q);
                                break;

                            case 114:
                                rb.keyPress(KeyEvent.VK_R);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_R);
                                break;

                            case 115:
                                rb.keyPress(KeyEvent.VK_S);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_S);
                                break;

                            case 116:
                                rb.keyPress(KeyEvent.VK_T);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_T);
                                break;

                            case 117:
                                rb.keyPress(KeyEvent.VK_U);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_U);
                                break;

                            case 118:
                                rb.keyPress(KeyEvent.VK_V);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_V);
                                break;

                            case 119:
                                rb.keyPress(KeyEvent.VK_W);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_W);
                                break;

                            case 120:
                                rb.keyPress(KeyEvent.VK_X);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_X);
                                break;

                            case 121:
                                rb.keyPress(KeyEvent.VK_Y);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_Y);
                                break;

                            case 122:
                                rb.keyPress(KeyEvent.VK_Z);
                                rb.delay(speed);// write speed by milisecondes
                                rb.keyRelease(KeyEvent.VK_Z);

                        }

                    } else {// switch on all symbols like ""
                        try {
                            switch (read) {
                                case 46: //46 is dot "."
                                    rb.keyPress(read);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(read);
                                    break;

                                case 32: //32 is Space " "
                                    rb.keyPress(KeyEvent.VK_SPACE);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_SPACE);
                                    break;

                                case 44: //44 is coma ","
                                    rb.keyPress(KeyEvent.VK_COMMA);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_COMMA);
                                    break;

                                case 58: //58 is colon ":"
                                    rb.keyPress(KeyEvent.VK_SHIFT);

                                    rb.keyPress(KeyEvent.VK_SEMICOLON);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_SEMICOLON);

                                    rb.keyRelease(KeyEvent.VK_SHIFT);
                                    break;

                                case 59: //59 is semecolon ";"
                                    rb.keyPress(KeyEvent.VK_SEMICOLON);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_SEMICOLON);
                                    break;

                                case 39: //39 is quote "'"
                                    rb.keyPress(KeyEvent.VK_QUOTE);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_QUOTE);
                                    break;

                                case 34: //34 is double quotes """
                                    rb.keyPress(KeyEvent.VK_SHIFT);

                                    rb.keyPress(KeyEvent.VK_QUOTE);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_QUOTE);

                                    rb.keyRelease(KeyEvent.VK_SHIFT);
                                    break;

                                case 45: //45 is minus "-"

                                    rb.keyPress(KeyEvent.VK_MINUS);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_MINUS);

                                    break;

                                case 42: //42 is divided "*"

                                    rb.keyPress(KeyEvent.VK_MULTIPLY);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_MULTIPLY);

                                    break;

                                case 47: //47 is multiply "/"

                                    rb.keyPress(KeyEvent.VK_DIVIDE);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_DIVIDE);

                                    break;

                                case 61: //61 is equals "="

                                    rb.keyPress(KeyEvent.VK_EQUALS);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_EQUALS);

                                    break;

                                case 92: //92 is backslash "\"

                                    rb.keyPress(KeyEvent.VK_BACK_SLASH);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_BACK_SLASH);

                                    break;

                                case 63: //63 is question mark "?"
                                    rb.keyPress(KeyEvent.VK_SHIFT);

                                    rb.keyPress(KeyEvent.VK_SLASH);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_SLASH);

                                    rb.keyRelease(KeyEvent.VK_SHIFT);

                                    break;

                                case 33: //33 is VK_EXCLAMATION_MARK "!"
                                    rb.keyPress(KeyEvent.VK_SHIFT);

                                    rb.keyPress(KeyEvent.VK_1);
                                    rb.delay(speed);// write speed by milisecondes
                                    rb.keyRelease(KeyEvent.VK_1);

                                    rb.keyRelease(KeyEvent.VK_SHIFT);

                                    break;

                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "there is an ERROR please contact the developer");
                        }
                    }

                    read = fr.read();

                }
            

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "one");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "two");
            }
        }

    }

}
