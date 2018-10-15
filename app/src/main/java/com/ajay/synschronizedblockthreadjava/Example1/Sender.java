package com.ajay.synschronizedblockthreadjava.Example1;


// This is the class that perform the task ...our task here is to send message

public class Sender {

    public void send(String msg)
    {
        System.out.println("our message -->\t"  + msg );  // the message we r sending
        try
        {
            Thread.sleep(5000);    // we are waiting 5 sec after sending (it is gonna take 5 sec to end this method ..so another thread object will not run till then (means it will not get into the sync block)
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");  // after waiting we showing message is sent.
        System.out.println();
    }
}
