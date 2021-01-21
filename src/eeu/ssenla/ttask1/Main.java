package eeu.ssenla.ttask1;
import java.util.*;

public class Main {

    static byte a;
    static short b;
    static int c;
    static long d;
    static float y;
    static double z;
    static char i;
    static boolean g;
    private String s;


    public static void main (String[] args){
        /*private Byte aByte;
        private Short bShort;
        private  Int cInt;
        private Long dLong;
        private Float yFloat;
        private Double zDouble;
        private Char iChar;
        private Boolean dBoolean;
        private String string;
         */
        byte a = 23;
        short b = 8;
        char i ='а';
        int c = 300;
        long d = 77748566L;
        double z = 7453.4563;
        float y = 434.673f;
        boolean g = true;


        System.out.println("Work : ");
        System.out.println(a);
        short x = (short) i;
        System.out.println(x);
        System.out.println(y);

        System.out.println();
        System.out.println("Get and Set");

        Number number = new Number();

        number.setA((byte) 90);
        number.setB((short) 55);
        number.setC(567);
        number.setD(222356L);
        number.setY(234.275f);
        number.setZ(566.5656);
        number.setI('5');
        number.setG(false);
        number.setS("Hello World");

        System.out.println(number.getA());
        System.out.println(number.getB());
        System.out.println(number.getC());
        System.out.println(number.getD());
        System.out.println(number.getY());
        System.out.println(number.getZ());
        System.out.println(number.getI());
        System.out.println(number.isG());
        System.out.println(number.getS());

    }
}