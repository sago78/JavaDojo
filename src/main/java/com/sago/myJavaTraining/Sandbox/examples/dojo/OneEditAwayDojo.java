package com.sago.myJavaTraining.Sandbox.examples.dojo;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;

public class OneEditAwayDojo extends Exercise {

    public OneEditAwayDojo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        out.println("----Difference at the end:");
        String s1 = "qwert";
        String s2 = "qwerty";
        out.println("S1: "+s1);
        out.println("S2: "+s2);
        out.println( isOneAway(s1,s2));

        out.println("----Difference in the middle:");
         s1 = "nohemi";
         s2 = "noemi";
        out.println("S1: "+s1);
        out.println("S2: "+s2);
        out.println( isOneAway(s1,s2));

        out.println("----More than one away in the middle:");
        s1 = "nohemi";
        s2 = "nooemi";
        out.println("S1: "+s1);
        out.println("S2: "+s2);
        out.println( isOneAway(s1,s2));

        out.println("----Difference in the begin:");
        s1 = "Julio";
        s2 = "tulio";
        out.println("S1: "+s1);
        out.println("S2: "+s2);
        out.println( isOneAway(s1,s2));

        out.println("----Same String:");
        s1 = "nohemi";
        s2 = "nohemi";
        out.println("S1: "+s1);
        out.println("S2: "+s2);
        out.println( isOneAway(s1,s2));

        out.println("----");
    }

    private boolean isOneAway(String s1, String s2){

        if (Math.abs(s1.length() - s2.length()) >1 ){
            return false;
        }
        else if(s1.length() == s2.length()) {
            return isOneAwaySameLength(s1, s2);
        }
        else if ( s1.length() > s2.length() ){
            return isOneAwayDiffLength(s1,s2);
        }else {
            return isOneAwayDiffLength(s2,s1);
        }

    }

    private boolean isOneAwaySameLength(String s1, String s2){
        int countDiff =0;

        for (int i = 0; i<s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                countDiff +=1;
                if (countDiff >1 ){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isOneAwayDiffLength(String s1, String s2){
        int i =0;
        int countDiff=0;
        while (i < s2.length()) {
            if (s1.charAt(i+countDiff) == s2.charAt(i)) {
                i+=1;
                countDiff += 1;
                if(countDiff > 1 ){
                    return false;
                }
            }

        }

        return true;
    }
}
