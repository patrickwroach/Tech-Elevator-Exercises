package com.techelevator;

import java.util.Arrays;
import java.util.List;

public class BabyLotto {

    private int[] ticket1;
    private int[] ticket2;
    private int[] ticket3;
    private int[] ticket4;
    private int[] ticket5;
    private List<int []> tickets;

    public int[] getTicket1() {
        return ticket1;
    }

    public List<int[]> getTickets() {
        return tickets;
    }

    public void setTickets(List<int[]> tickets) {
        this.tickets = tickets;
    }

    public void buildTickets() {
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

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

    public int[] getTicket2() {
        return ticket2;
    }

    public void setTicket2(String ticket2) {
        String[] strArr = ticket2.split(",");
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
        this.ticket2 = ticket;

    }

    public int[] getTicket3() {
        return ticket3;
    }

    public void setTicket3(String ticket3) {
        String[] strArr = ticket3.split(",");
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

        this.ticket3 = ticket;
    }

    public int[] getTicket4() {
        return ticket4;
    }

    public void setTicket4(String ticket4) {
        String[] strArr = ticket4.split(",");
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
        this.ticket4 = ticket;

    }

    public int[] getTicket5() {
        return ticket5;
    }

    public void setTicket5(String ticket5) {
        String[] strArr = ticket5.split(",");
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
        this.ticket5 = ticket;

    }
}
