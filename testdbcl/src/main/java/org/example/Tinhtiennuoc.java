//package org.example;
//
//import java.util.Scanner;
//
//public class Tinhtiennuoc {
////    public Tinhtiennuoc() {
////    }
//
//    public int Tinhtiennuoc1(int thangNay, int thangTruoc)
//
//
//    {
//        int muctieuthu = thangNay - thangTruoc;
//        int tong = 0;
//        int muc1;
//        int muc2;
//        int muc3;
//        int muc4;
//        System.out.println("muc tieu thu:" + muctieuthu);
//        if(muctieuthu < 0)
//        {
//            System.out.println("so khong hop le");
//            return -1;
//        }
//        else{
//            if( muctieuthu <=10)
//            {
//                muc1 = muctieuthu;
//                System.out.println("muc1: " + muc1 + ", " +"don gia: " + 5973 +" "+ "tong gia muc1: " + (muc1 * 5973));
//                tong = muc1 * 5973;
//            }
//            else if(muctieuthu>10 && muctieuthu<=20){
//                muc1 = 10;
//                System.out.println("muc1: " + muc1 + ", " +"don gia: " + 5973 +", "+ "tong gia muc1: " + (10 * 5973));
//                muc2 = muctieuthu - 10;
//                System.out.println("muc2: " + muc2 + ", " +"don gia: " + 7052 +", "+ "tong gia muc2: " + (muc2 * 7052));
//                tong = muc1*5973 + muc2*7052;
//            }
//            else if(muctieuthu>20 && muctieuthu<=30)
//            {
//                muc1 = 10;
//                System.out.println("muc1: " + muc1 + ", " +"don gia: " + 5973 +", "+ "tong gia muc1: " + (muc1 * 7052));
//                muc2 = 10;
//                System.out.println("muc2: " + muc2 + ", " +"don gia: " + 7052 +", "+ "tong gia muc2: " + (muc2 * 7052));
//                muc3 = muctieuthu - 20;
//                System.out.println("muc3: " + muc3 + ", " +"don gia: " + 8669 +", "+ "tong gia muc3: " + (muc3 * 8669));
//                tong = muc1*5973 + muc2*7052 + muc3*8669;
//            }
//            else if(muctieuthu>30)
//            {
//                muc1 = 10;
//                System.out.println("muc1: " + muc1 + ", " +"don gia: " + 5973 +", "+ "tong gia muc1: " + (muc1 * 7052));
//                muc2 = 10;
//                System.out.println("muc2: " + muc2 + ", " +"don gia: " + 7052 +", "+ "tong gia muc2: " + (muc2 * 7052));
//                muc3 = 10;
//                System.out.println("muc3: " + muc3 + ", " +"don gia: " + 8669 +", "+ "tong gia muc3: " + (muc3 * 8669));
//                muc4 = muctieuthu - 30;
//                System.out.println("muc4: " + muc4 + ", " +"don gia: " + 15929 +", "+ "tong gia muc4: " + (muc4 * 15929));
//                tong = muc1*5973 + muc2*7052 + muc3*8669 + muc4*15929;
//            }
//        }
//
//        int thue = (int) Math.round(tong * 0.05);
//        System.out.println("thue 5% : " + thue);
//        int phimt = (int) Math.round(tong * 0.1);
//        System.out.println("phi mt: "+ phimt);
//        int tongcong = tong + thue + phimt;
//        return tongcong;
//    }
//
//}
package org.example;

import java.util.Scanner;

public class Tinhtiennuoc {

    public int Tinhtiennuoc1(int thangNay, int thangTruoc) {
        int muctieuthu = thangNay - thangTruoc;
        int tong = 0;
        int muc1;
        int muc2;
        int muc3;
        int muc4;
        System.out.println("muc tieu thu: " + muctieuthu);
        if (muctieuthu < 0) {
            System.out.println("so khong hop le");
            return -1;
        } else {
            if (muctieuthu <= 10) {
                muc1 = muctieuthu;
                System.out.println("muc1: " + muc1 + ", don gia: 5973, tong gia muc1: " + (muc1 * 5973));
                tong = muc1 * 5973;
            } else if (muctieuthu > 10 && muctieuthu <= 20) {
                muc1 = 10;
                System.out.println("muc1: " + muc1 + ", don gia: 5973, tong gia muc1: " + (10 * 5973));
                muc2 = muctieuthu - 10;
                System.out.println("muc2: " + muc2 + ", don gia: 7052, tong gia muc2: " + (muc2 * 7052));
                tong = muc1 * 5973 + muc2 * 7052;
            } else if (muctieuthu > 20 && muctieuthu <= 30) {
                muc1 = 10;
                System.out.println("muc1: " + muc1 + ", don gia: 5973, tong gia muc1: " + (muc1 * 5973));
                muc2 = 10;
                System.out.println("muc2: " + muc2 + ", don gia: 7052, tong gia muc2: " + (muc2 * 7052));
                muc3 = muctieuthu - 20;
                System.out.println("muc3: " + muc3 + ", don gia: 8669, tong gia muc3: " + (muc3 * 8669));
                tong = muc1 * 5973 + muc2 * 7052 + muc3 * 8669;
            } else if (muctieuthu > 30) {
                muc1 = 10;
                System.out.println("muc1: " + muc1 + ", don gia: 5973, tong gia muc1: " + (muc1 * 5973));
                muc2 = 10;
                System.out.println("muc2: " + muc2 + ", don gia: 7052, tong gia muc2: " + (muc2 * 7052));
                muc3 = 10;
                System.out.println("muc3: " + muc3 + ", don gia: 8669, tong gia muc3: " + (muc3 * 8669));
                muc4 = muctieuthu - 30;
                System.out.println("muc4: " + muc4 + ", don gia: 15929, tong gia muc4: " + (muc4 * 15929));
                tong = muc1 * 5973 + muc2 * 7052 + muc3 * 8669 + muc4 * 15929;
            }
        }

        int thue = (int) Math.round(tong * 0.05);
        System.out.println("thue 5% : " + thue);
        int phimt = (int) Math.round(tong * 0.1);
        System.out.println("phi mt: " + phimt);
        int tongcong = tong + thue + phimt;
        return tongcong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chi so nuoc thang nay: ");
        int thangNay = scanner.nextInt();
        System.out.print("Nhap chi so nuoc thang truoc: ");
        int thangTruoc = scanner.nextInt();

        Tinhtiennuoc ttn = new Tinhtiennuoc();
        int tongcong = ttn.Tinhtiennuoc1(thangNay, thangTruoc);
        if (tongcong != -1) {
            System.out.println("Tong cong tien nuoc: " + tongcong);
        }
    }
}
