package com.sda.java.advance.exercises;

public enum Runner {
    BEGINNER(0, 120),
    INTERMEDIATE(120, 240),
    ADVANCED(240 , 360);

    private  final int  minTime;

    private  final  int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time){
        if(time<0){
            time  = 0;
        }
//        if(time>= BEGINNER.minTime  && time< BEGINNER.minTime) return  BEGINNER;
//        if(time>= INTERMEDIATE.minTime  && time< INTERMEDIATE.minTime) return  INTERMEDIATE;
//        if(time>= ADVANCED.minTime  && time< ADVANCED.minTime) return  ADVANCED;
        for (Runner r : Runner.values()){
            if(time>=r.minTime &&  time < r.maxTime){
                return  r ;
            }
        }

        return  ADVANCED;
    }

}
