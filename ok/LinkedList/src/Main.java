/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoang
 */
public class Main {
    public static void main(String[] args) {
         MyQueue mq = new MyQueue();
         String s = "alibaba";
         for (int i = s.length() - 1; i >= 0; i--) {
            mq.enqueue(s.charAt(i));
        }
         String rs = "";
         while(!mq.isEmpty()) rs += mq.dequeue();
         System.out.println(rs);
    }
}
