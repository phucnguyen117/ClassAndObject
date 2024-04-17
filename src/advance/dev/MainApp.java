package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Khởi tạo mảng chứa 10 sinh viên
		Student[] danhSachSinhVien = new Student[10];
	}

	// Phương thức để nhập danh sách sinh viên
	public static void input(Student[] danhSachSinhVien) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < danhSachSinhVien.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");

			System.out.print("Tên: ");
			String ten = scanner.nextLine();

			System.out.print("Tuổi: ");
			int tuoi = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Địa chỉ: ");
			String diaChi = scanner.nextLine();

			System.out.print("Số điện thoại: ");
			String soDienThoai = scanner.nextLine();

			System.out.print("Điểm trung bình: ");
			double diemTrungBinh = scanner.nextDouble();
			scanner.nextLine();

			// Khởi tạo và thêm sinh viên vào mảng
			danhSachSinhVien[i] = new Student(ten, tuoi, diaChi, soDienThoai, diemTrungBinh);
		}
	}

	// in ra danh sách sinh viên
	public static void print(Student[] danhSachSinhVien) {
		for (int i = 0; i < danhSachSinhVien.length; i++) {
			System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + danhSachSinhVien[i].getTen());
			System.out.println("Tuổi: " + danhSachSinhVien[i].getTuoi());
			System.out.println("Địa chỉ: " + danhSachSinhVien[i].getDiaChi());
			System.out.println("Số điện thoại: " + danhSachSinhVien[i].getSoDienThoai());
			System.out.println("Điểm trung bình: " + danhSachSinhVien[i].getDiemTrungBinh());
		}
	}
}
