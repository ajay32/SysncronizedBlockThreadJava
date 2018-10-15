package com.ajay.synschronizedblockthreadjava.Example1;


// This is the class thourgh which hat we are gonna use to send msg (Task) one by one..
public class ThreadSend extends Thread {

    private String mMsg;
    Sender  sender;  // receiveing object of our task class ..
    ThreadSend(String msg , Sender obj) {

        mMsg = msg;
        sender =  obj;
    }

    public void run() {

        // only one object will go inside it and finish with send method  ..then another object will endter
        synchronized (sender) {
            sender.send(mMsg);  // taking obj and synchrozing it
        }
    }


}
