package Bai7_XuLyMang;

public class DemoArray2 {
    public static void main(String[] args) {
        int number[] = new int[10];

        //Gán giá trị thông qua vòng lặp for
        for (int i = 0; i < number.length; i++) {
            number[i] = i+1;
        }

        number[3] = 2000;
        number[7] = 450;

        //Duyệt mảng number bằng vòng lặp FOR cải tiến
        for (int temp : number) {
            System.out.println(temp);
        }

        String emailList[] = new String[4];
        emailList[0] = "admin@example.com";
        emailList[1] = "project@example.com";

        System.out.println(emailList[0]);
        System.out.println(emailList.length);

        //Khai báo và gán giá trị cho mảng trực tiếp (nặc danh)
        String emailData[] = {"admin@example.com", "project@example.com", "client@example.com"};

        System.out.println(emailData[1]);
        System.out.println(emailData.length);

    }
}
