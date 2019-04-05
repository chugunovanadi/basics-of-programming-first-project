package ru.spbu.apmath.prog.hw1.task2;

public class Employee {
    private String WORKER_NAME;
    private double MONEY_HOUR;
    private int TIMER;


    public Employee(String WORKER_NAME, double MONEY_HOUR,int TIMER){
        this.WORKER_NAME = WORKER_NAME;
        this.MONEY_HOUR= MONEY_HOUR;
        this.TIMER = TIMER;
    }

    public String getName(){ return WORKER_NAME;}
    public double getSalary_per_hour() {
        return MONEY_HOUR;
    }
    public int getHours(){ return TIMER; }

    double MIN_MONEY_HOUR = 70d;
    int NORM_WORKTIME = 40;
    int MAX_TIME = 60;



    public double getSalary(){
        if(TIMER > MAX_TIME  || (MIN_MONEY_HOUR - MONEY_HOUR) > 0.00001d){
            throw new IllegalStateException(); }
        if (TIMER > NORM_WORKTIME  && TIMER< MAX_TIME ){
            return TIMER*1.5d*MONEY_HOUR; }
        return TIMER*MONEY_HOUR;
    }
}
