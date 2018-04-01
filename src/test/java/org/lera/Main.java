package org.lera;

public class Main {

        int number;
        int privateNumber;
        private void setNumbеr(int i) { privateNumber = i; }
        public void setNumber(int i) { number = i; }


    public static void main(String[] args) {
        try {
            System.out.println("Try block is executed");
        } finally {
            System.out.println("Finally block is executed");
        }

    }
}