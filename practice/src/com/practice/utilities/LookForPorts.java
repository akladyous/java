package com.practice.utilities;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LookForPorts {

    public static void main(String[] args) {

        Socket theSocket;
        String host = "localhost";

        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("Looking for "+ i);
                theSocket = new Socket(host, i);
                System.out.println("There is a server on port " + i + " of " + host);
            }
            catch (UnknownHostException e) {
                System.err.println(e);
                break;
            }
            catch (IOException e) {
                // must not be a server on this port
            }
        }
    }
}
