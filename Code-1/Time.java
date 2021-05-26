import java.util.*;
public class Time
{
    private int hour, min, sec;
    Time(int h, int m, int s){
        hour = h;
        min = m;
        sec = s;
    }

    Time( ){
        hour = 0;
        min = 0;
        sec = 0;
    }
    Time add(Time x2){
        Time x4 = new Time();
        x4.sec = this.sec+x2.sec;
        if (x4.sec>60){
            x4.min += 1;
            x4.sec -= 60;
        }
        x4.min  +=  this.min + x2.min;
        if (x4.min>60){
            x4.min -= 60;
            x4.hour += 1;
        }
        x4.hour  +=  this.hour + x2.hour;
        return x4;
    }
    void show(){
        System.out.println("hour:min:sec");
        System.out.println(hour+ ":" + min + ":" + sec);
    }
    
    public static void main(String args[]){
        Time x1 = new Time(12, 59, 59);
        Time x2 = new Time(1, 0, 0);
        Time x3 = x1.add(x2);
        x1.show();
        x2.show();
        x3.show();
    }
}
