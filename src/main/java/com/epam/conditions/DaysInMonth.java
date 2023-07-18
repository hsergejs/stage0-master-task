package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        String invDate = "invalid date";
        boolean isLeapYear = false;
        int days = 0;
        if(year >= 1 && year <= 9999){
            if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
                isLeapYear = true;
            }
        }
        else{
            System.out.println(invDate);
            return;
        }

        if(month >= 1 && month <= 12) {
            if (year >= 1 && year <= 9999) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        days = 31;
                        break;
                    case 2:
                        if(isLeapYear) {
                            days = 29;
                            break;
                        } else {
                            days = 28;
                            break;
                        }
                    case 4, 6, 9, 11:
                        days = 30;
                        break;
                    default:
                        break;
                }

                System.out.println(days);
            }
            else{
                System.out.println(invDate);
            }
        }
        else{
            System.out.println(invDate);
        }
    }

}
