package com.company;

public class Main {

    public static void main(String[] args) {
        String srt=args[0];
        for (int i=1;i<args.length;i++){
            srt=srt.concat(args[i]);
        }
        System.out.println(srt+" ");
        int shift=3;
        srt=shiftRight(srt,shift);
        System.out.print(srt);
    }
    public static String shiftRight(String srt,int shift){
        for (int i=0;i<shift;i++){
            srt=srt.substring(srt.length()-1)+srt.substring(0,srt.length()-1);
        }
        return srt;
    }
}
