package com.monterio.introduction;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {

        DoNotTerminate.setPreventExit(true);

        try {
            DoNotTerminate.exit(0);
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("System exit was prevented.");
        }

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            //Write your code here
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

class DoNotTerminate {

    public static class ExitTrappedException extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }

    private static boolean preventExit = false;

    /**
     * Configura se a saída do sistema deve ser impedida.
     *
     * @param preventExit true para impedir a saída do sistema, false caso contrário
     */
    public static void setPreventExit(boolean preventExit) {
        DoNotTerminate.preventExit = preventExit;
    }

    /**
     * Verifica se a saída do sistema está sendo impedida e lança uma exceção se for o caso.
     *
     * @throws ExitTrappedException se a saída estiver sendo impedida
     */
    public static void checkForExit() {
        if (preventExit) {
            throw new ExitTrappedException();
        }
    }

    /**
     * Método utilitário para substituir System.exit(). Verifica se a saída deve
     * ser impedida antes de realmente chamar System.exit().
     *
     * @param status o status de saída
     */
    public static void exit(int status) {
        checkForExit();
        System.exit(status);
    }
}