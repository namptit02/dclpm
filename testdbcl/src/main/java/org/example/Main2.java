//package org.example;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Tinhtiennuoc i = new Tinhtiennuoc();
//        System.out.println("====================================================");
//        System.out.println("HÓA ĐƠN TIỀN NƯỚC");
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Số đọc tháng trước: " + soDocThangTruoc);
//        System.out.println("Số đọc tháng này: " + soDocThangNay);
//        System.out.println("Số lượng tiêu thụ: " + soLuongTieuThu + " m3");
//        System.out.println("---------------------------------------------------");
//        for (ChiTietTienNuoc chiTiet : chiTietTienNuoc) {
//            System.out.println("Mức: " + chiTiet.getMuc() + ", Đơn giá: " + chiTiet.getDonGia() + " đồng, Thành tiền: " + chiTiet.getThanhTien() + " đồng");
//        }
//        System.out.println("---------------------------------------------------");
//        System.out.println("Thành tiền nước: " + chiTietTienNuoc.stream().mapToInt(ChiTietTienNuoc::getThanhTien).sum() + " đồng");
//        System.out.println("Thuế GTGT (5%): " + thueGTGT + " đồng");
//        System.out.println("Phí bảo vệ môi trường (10%): " + phiBaoVeMT + " đồng");
//        System.out.println("---------------------------------------------------");
//        System.out.println("Tổng số tiền thanh toán: " + tongSoTien + " đồng");
//        System.out.println("====================================================");
//
//        scanner.close();
//    }
//}
