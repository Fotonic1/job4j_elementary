package ru.job4j.ex;

public class Fact {
        public static void main(String[] args) {
            int a = new Fact().calc(-10);
        }

        public int calc(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("This argument is not corrected");
            }
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
}
