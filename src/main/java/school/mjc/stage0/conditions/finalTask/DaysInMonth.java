package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int i=0;
        if(year%400==0){
            i=1;
        }else if(year%4==0&&year%100!=0){
            i=1;
        }else{
            i=0;
        }
        switch (month) {
            default:
                System.out.println("invalid date");
                break;
            case 1:
                System.out.println("31");
                break;
            case 2:
                if(i==0) {
                    System.out.println("28");
                }else{
                    System.out.println("29");
                }
                break;
            case 12:
                System.out.println("31");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
        }


    }
}
