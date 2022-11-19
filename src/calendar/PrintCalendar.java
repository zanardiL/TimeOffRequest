package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

public  class PrintCalendar {
    public void calendar(LocalDate startDate) {
        String calendar[][] = new String[5][7];
        int firstDayOfMonth = getFirstDayOfMonth(startDate);
        int daysInMonth = startDate.lengthOfMonth();
        int day = 1;

        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0) && (j + 1) < firstDayOfMonth) {
                    calendar[i][j] = "\t";
                } else if (day > daysInMonth) {
                    break;
                } else {
                    calendar[i][j] = String.valueOf("\t" + day);
                    day++;
                }
            }
        }

        printCalendar(startDate, calendar);
    }

    public void printCalendar (LocalDate startDate, String calendar[][]) {
        String month = String.valueOf(startDate.getMonth());
        String year = String.valueOf(startDate.getYear());
        System.out.println("  ⎾⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺⏋");
        System.out.println("\t\t" + month + "\t" + year);
        System.out.println("  ⎿⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⎽⏌");
        System.out.println("\tS\tM\tT\tW\tT\tF\tS ");

        for (int i = 0; i < calendar.length; i++) {
            for (int j = 0; j < 7; j++) {
                if(calendar[i][j]==null) {
                    break;
                }
                System.out.print(calendar[i][j]);
            }
            System.out.println();
        }
    }

        public int getFirstDayOfMonth(LocalDate localDate) {
            int firstDayOfMonth;
            DayOfWeek dayOfWeek = localDate.withDayOfMonth(1).getDayOfWeek();
            switch (dayOfWeek) {
                case SUNDAY:
                     firstDayOfMonth = 1;
                     break;
                case MONDAY:
                    firstDayOfMonth = 2;
                    break;
                case TUESDAY:
                    firstDayOfMonth = 3;
                    break;
                case WEDNESDAY:
                    firstDayOfMonth = 4;
                    break;
                case THURSDAY:
                    firstDayOfMonth = 5;
                    break;
                case FRIDAY:
                    firstDayOfMonth = 6;
                    break;
                case SATURDAY:
                    firstDayOfMonth = 7;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dayOfWeek);
            }
            return firstDayOfMonth;
        }
    }




