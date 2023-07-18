package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
            //December, January, February
            case 1,2,12:
                System.out.println("Winter");
                break;
            //March, April, May
            case 3,4,5:
                System.out.println("Spring");
                break;
            //June, July, August
            case 6,7,8:
                System.out.println("Summer");
                break;
            //September, October, November
            case 9,10,11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month number");
        }
    }

}
