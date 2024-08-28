/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra_nguyenphuocduy_02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        QuanLiCD qlcd = new QuanLiCD();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("===== Menu =====");
            System.out.print("\n1. Xuat toan bo CD va tong tri gia cua CD");
            System.out.print("\n2. Lay ra CD phat hanh truoc nam 2020");
            System.out.print("\n3. Tim CD ma cac CD co chua chu tinh");
            System.out.print("\n4. Sap xep CD theo gia giam dan");
            System.out.print("\n5. Xoa CD theo ma so");
            System.out.print("\n6. Sua gia ban theo ma so");
            System.out.print("\n7. Tinh tong tri gia cac CD");
            System.out.print("\n0. Thoat");
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlcd.xuatTT();
                    break;
                case 2:
                    qlcd.layCDTruoc2020();
                    break;
                case 3:
                    qlcd.timCDTheoTen();
                    break;
                case 4:
                    qlcd.sapXep();
                    System.out.print("Da sap xep theo gia giam dan.");
                    break;
                case 5:
                    System.out.print("Nhap ma so CD can xoa: ");
                    String masoXoa = sc.nextLine();
                    qlcd.xoaCDTheoMaSo(masoXoa);
                    System.out.print("Da xoa CD co ma so: " + masoXoa);
                    break;
                case 6:
                    System.out.print("Nhap ma so CD can sua gia: ");
                    String masoSua = sc.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double giaMoi = sc.nextDouble();
                    qlcd.suaGiaBanTheoMaSo(masoSua, giaMoi);
                    System.out.print("Da sua gia CD co ma so: " + masoSua);
                    break;
                case 7:
                    double tongTriGia = qlcd.tongTriGia();
                    System.out.print("Tong tri gia cua cac CD: " + tongTriGia);
                    break;
                case 0:
                    System.out.print("Thoat.");
                    break;
                default:
                    System.out.print("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }
}
