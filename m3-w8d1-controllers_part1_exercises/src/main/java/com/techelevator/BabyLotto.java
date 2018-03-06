package com.techelevator;

import java.util.Arrays;
import java.util.List;

public class BabyLotto {

    private int[] ticket1;
    private String[] ticket2;
    private String[] ticket3;
    private String[] ticket4;
    private String[] ticket5;

    public int[] getTicket1() {
        return ticket1;
    }

    public void setTicket1(String ticket1) {
        String[] strArr = ticket1.split(",");
        int[] ticket = new int[strArr.length + 1];

        for (int i = 0; i < strArr.length; i++){
            ticket[i] = Integer.parseInt(strArr[i]);
        }

        if ( (ticket[0] == ticket[1]) && (ticket[1] == ticket[2])){
            ticket[3] = 20;
        }
        else if ( (ticket[0] == ticket[1]) || (ticket[1] == ticket[2]) || (ticket[0] == ticket[2]) ){
            ticket[3] = 10;
        }
        else {
            ticket[3] = 0;
        }

            this.ticket1 = ticket;

    }

    public String[] getTicket2() {
        return ticket2;
    }

    public void setTicket2(String ticket2) {
        this.ticket2 = ticket2.split(",");
    }

    public String[] getTicket3() {
        return ticket3;
    }

    public void setTicket3(String ticket3) {
        this.ticket3 = ticket3.split(",");
    }

    public String[] getTicket4() {
        return ticket4;
    }

    public void setTicket4(String ticket4) {
        this.ticket4 = ticket4.split(",");
    }

    public String[] getTicket5() {
        return ticket5;
    }

    public void setTicket5(String ticket5) {
        this.ticket5 = ticket5.split(",");
    }
}
