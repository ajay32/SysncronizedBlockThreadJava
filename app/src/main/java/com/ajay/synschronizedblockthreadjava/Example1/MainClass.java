package com.ajay.synschronizedblockthreadjava.Example1;


// This is the class where we initilize the process of task performing
public class MainClass {

    public static void main(String args[]) {

        Sender sender = new Sender();
        ThreadSend threadSend1 = new ThreadSend("my first message",sender);
        ThreadSend threadSend2 = new ThreadSend("my second message",sender);
        ThreadSend threadSend3 = new ThreadSend("my third message",sender);

        // any one of object can start (not leaneraly)
        //to start a thread
        threadSend1.start();
        threadSend2.start();
        threadSend3.start();


        // wait for threads to end
        try
        {
            threadSend1.join();
            threadSend2.join();
            threadSend3.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }

    }


}
