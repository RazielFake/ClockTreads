
package controllers;

import controllers.threads.clockThread;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author Raziel
 */
public class Controller {
    private clockThread CK1;
    private clockThread CK2;
    private clockThread CK3;
    private clockThread CK4;
    
    private JLabel Clock1;
    private JLabel Clock2;
    private JLabel Clock3;
    private JLabel Clock4;
    
    public Controller(JLabel c1,JLabel c2,JLabel c3,JLabel c4){
        this.Clock1 = c1;
        this.Clock2 = c2;
        this.Clock3 = c3;
        this.Clock4 = c4;
    }
    
    public void iniciar(){
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        LocalDateTime locaDate = LocalDateTime.now();
        CK1 = new clockThread(Clock1, locaDate.getHour(), locaDate.getMinute(), locaDate.getSecond());
        CK2 = new clockThread(Clock2, tlr.nextInt(0,23), tlr.nextInt(0,59), tlr.nextInt(0,59));
        CK3 = new clockThread(Clock3, tlr.nextInt(0,23), tlr.nextInt(0,59), tlr.nextInt(0,59));
        CK4 = new clockThread(Clock4, tlr.nextInt(0,23), tlr.nextInt(0,59), tlr.nextInt(0,59));
        CK1.start();
        CK2.start();
        CK3.start();
        CK4.start();
    }
    
    public void modify(int numberClock, boolean modif, int... hour){
        switch(numberClock){
            case 1:
                if(modif){
                    CK1.pause();
                }else{
                    CK1.setHoras(hour[0]);
                    CK1.setMinutos(hour[1]);
                    CK1.setSegundos(hour[2]);
                    CK1.restart();
                }
                break;
            case 2:
                if(modif){
                    CK2.pause();
                }else{
                    CK2.setHoras(hour[0]);
                    CK2.setMinutos(hour[1]);
                    CK2.setSegundos(hour[2]);
                    CK2.restart();
                }
                break;
            case 3:
                if(modif){
                    CK3.pause();
                }else{
                    CK3.setHoras(hour[0]);
                    CK3.setMinutos(hour[1]);
                    CK3.setSegundos(hour[2]);
                    CK3.restart();
                }
                break;
            case 4:
                if(modif){
                    CK4.pause();
                }else{
                    CK4.setHoras(hour[0]);
                    CK4.setMinutos(hour[1]);
                    CK4.setSegundos(hour[2]);
                    CK4.restart();
                }
                break;
        }
    }
    
    
    public void adjustSpeed(int numClock, int speed){
        switch(numClock){
            case 1:
                CK1.setSpeed(speed);
                break;
            case 2:
                CK2.setSpeed(speed);
                break;
            case 3:
                CK3.setSpeed(speed);
                break;
            case 4:
                CK4.setSpeed(speed);
                break;
        }
    }
    
    
    
}
