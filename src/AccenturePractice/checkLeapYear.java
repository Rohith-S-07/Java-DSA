package AccenturePractice;

public class checkLeapYear {
    public static void main(String[] args) {
        int year = 2308;
        System.out.println(checkLeap(year));
    }

    public static boolean checkLeap(int year){
        if((year%4 ==0 && year%100!=0) || (year%400==0)){
            return true;
        }
        else return false;
    }
}
