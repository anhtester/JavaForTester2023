package Bai9_XuLyChuoiString;

public class XuLyChuoi {
    public static void main(String[] args) {

        //LƯU Ý: chuỗi sẽ tính từng vị trí kí tự và bắt đầu từ 0

        String str1 = "Anh Tester chia sẻ kiến thức Tester, khóa học Testing miễn phí về Automation Testing";
        String str2 = "và Manual Testing";

        //Độ dài chuỗi
        System.out.println(str1.length());

        //Cắt chuỗi: dùng hàm substring
        System.out.println("CẮT CHUỖI dạng thứ nhất: " + str1.substring(11));
        System.out.println("CẮT CHUỖI dạng thứ hai: " + str1.substring(11, 35));

        //Ghép chuỗi: dùng dấu + hoặc hàm concat
        System.out.println("NỐI CHUỖI: " + str1 + " " + str2);
        System.out.println("NỐI CHUỖI: " + str1.concat(str2));
        System.out.println("NỐI CHUỖI: " + str1.concat(" ").concat(str2));
        System.out.println("NỐI CHUỖI: " + str1.concat(" " + str2));

        //Tách chuỗi: dùng hàm split
        System.out.println("TÁCH CHUỖI: " + str1.split(",")[0]); //Lấy giá trị đầu tiên sau khi tách chuỗi
        System.out.println("TÁCH CHUỖI: " + str1.split(",")[1]);

        //Loại bỏ khoảng trắng 2 đầu
        System.out.println("TÁCH CHUỖI: " + str1.split(",")[1].trim().toUpperCase().toLowerCase());

        String str3 = "API Testing With Postman";
        String str4 = "API Testing With Postman Tools";
        String str5 = "api testing with postman";

        System.out.println("SO SÁNH CHỨA: " + str3.contains("Postman"));
        System.out.println("SO SÁNH CHỨA: " + str3.contains("Selenium"));
        System.out.println("SO SÁNH CHỨA: " + str3.contains("Testing"));

        System.out.println("SO SÁNH BẰNG: " + str3.equals(str4));
        System.out.println("SO SÁNH BẰNG: " + str3.equals("API Testing With Postman"));
        System.out.println("SO SÁNH BẰNG: " + str3.equals(str5));
        System.out.println("SO SÁNH BẰNG: " + str3.equalsIgnoreCase(str5)); //Bỏ qua phân biệt hoa thường

        //Kiểm tra giá trị bắt đầu và kết thúc của một chuỗi
        System.out.println("BẮT ĐẦU: " + str3.startsWith("API"));
        System.out.println("KẾT THÚC: " + str3.endsWith("Postman"));

        System.out.println("BẮT ĐẦU: " + str3.startsWith("API123"));
        System.out.println("KẾT THÚC: " + str3.endsWith("Postman123"));

        String name = "  ";
        System.out.println("KHÔNG XEM SPACE LÀ CHUỖI RỖNG: " + name.isEmpty());
        System.out.println("XEM SPACE LÀ CHUỖI RỖNG: " + name.isBlank());
    }
}
