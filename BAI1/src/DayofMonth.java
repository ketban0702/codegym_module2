import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap year: ");
        int year = scanner.nextInt();
        System.out.println("Nhap month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " Co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+ month + " Co 30 ngay");
                break;
            case 2: {
                if (((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0))
                    System.out.println("Thang "+ month +"/"+ year +" Co 29 ngay");
                else
                    System.out.println("Thang "+ month +"/"+ year +" Co 28 ngay");
            }
                break;
            default:
                System.out.println(" Chi co 12 thang thoi. Moi ban nhap lai");
        }
    }
}
