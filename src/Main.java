import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select;
        do {
            System.out.println("Vui lòng nhập tên sinh viên");
            String name = scanner.nextLine();
            System.out.println("Vui lòng nhập địa chỉ sinh viên");
            String address = scanner.nextLine();
            System.out.println("Vui lòng nhập tuổi sinh viên");
            int age = Integer.parseInt(scanner.nextLine());

            String info = "Tên: "+name+", "+"Địa Chỉ: "+address+", "+"Tuổi: "+age;
            System.out.println("Thông tin sinh viên: "+info);

            System.out.println("Bạn có muốn tiếp tục không>(Y/N)");
            select = scanner.nextLine();
        } while (select.equalsIgnoreCase("Y"));
    }
}
