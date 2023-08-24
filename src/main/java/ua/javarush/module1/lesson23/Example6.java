package ua.javarush.module1.lesson23;

public class Example6 {
    public static void main(String[] args) {
        int numberOfDays = daysInMonth(null);
        System.out.println(numberOfDays);

    }

    public static int daysInMonth(Month month) {
//        return month == null ? 0 : switch (month) {
//            case JANUARY,
//                    MARCH,
//                    MAY,
//                    JULY,
//                    AUGUST,
//                    OCTOBER,
//                    DECEMBER -> 31;
//            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
//            case FEBRUARY -> 28;
//            default -> throw new IllegalArgumentException();
//        };
        return 1;
    }


    public static int daysInMonth2(Month month) {
        int result = 0;
        if (month != null) {
            switch (month) {
                case JANUARY:
                case MARCH:
                case MAY:
                case JULY:
                case AUGUST:
                case OCTOBER:
                case DECEMBER:
                    result = 31;
                    break;
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    result = 30;
                    break;
                case FEBRUARY:
                    result = 28;
                    break;
            }
        }
        return result;
    }

    public static int daysInMonth3(Month month) {
        if (month == null) {
            return 0;
        }
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            case FEBRUARY:
                return 28;
            default:
                return 0;

        }
    }

    public static int daysInMonth4(Month month) {
        if (month == null) {
            return 0;
        } else {
            return 0;
        }
    }



}


enum Month {
    JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER,
    APRIL, JUNE, SEPTEMBER, NOVEMBER, FEBRUARY,
}
