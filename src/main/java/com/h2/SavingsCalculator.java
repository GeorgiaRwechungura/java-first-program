package com.h2;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

    public static void main(String[] args){
        String[] creditsAsString=args[0].split(",");
        String[] debitsAsString=args[1].split(",");
        //float[] credits=new float[];
        for(int i=0; i<creditsAsString.length; i++){

        }

    }

    public SavingsCalculator(float[] credits, float[] debits){
        this.credits=credits;
        this.debits=debits;

    }
    private float sumOfCredits(){
        float sum=0.0f;
        for(int i=1; i<=credits.length; i++){
            sum+=i;
        }
        return sum;

    }
    private float sumOfDebits(){
        float sum=0.0f;
        for(int i=1; i<=debits.length; i++){
            sum=+i;
        }
        return  sum;

    }
    private  static  int remainingDaysInMonth(LocalDate date){
        YearMonth yearMonth=YearMonth.of(2020, Month.OCTOBER);
        int totalDaysInMonth=yearMonth.lengthOfMonth();
        int remainingDays=totalDaysInMonth-date.getDayOfMonth();
       return  remainingDays;
    }
    public float calculate(){
       return sumOfCredits()-sumOfDebits();
    }

}
