package com.train;

public class Ticket {
    int totalTickets;
    int rtTickets;

    public Ticket(int totalTickets , int rtTickets ){
        this.totalTickets = totalTickets;
        this.rtTickets = rtTickets;
    }

    public void print(){
        System.out.println("Total tickets:"+totalTickets+"\n"+
                           "Round-trip:"+rtTickets+"\n"+
                           "Total:"+(int)((totalTickets-rtTickets)*1000+(rtTickets*2000*0.9)));
    }
}
