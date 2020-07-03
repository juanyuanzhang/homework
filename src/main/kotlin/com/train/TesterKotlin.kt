package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totalTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var rtTickets = scanner.nextInt()
    val ticket = TicketKotlin(totalTickets, rtTickets)
    ticket.print()
}

class TicketKotlin(var totalTickets: Int , var rtTickets: Int){
    fun print(){
        println("Total tickets:"+totalTickets+"\n"+
                "Round-trip:"+rtTickets+"\n"+
                "Total:"+((totalTickets-rtTickets)*1000+(rtTickets*2000*0.9)).toInt())
    }
}