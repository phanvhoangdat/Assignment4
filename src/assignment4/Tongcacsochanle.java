/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

public class Tongcacsochanle {

    public static void main(String[] args) {
        // Khởi tạo tổng cho số chẵn và số lẻ
        int tongChan = 0;
        int tongLe = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Kiểm tra số chẵn
                tongChan += i;
            } else { // Nếu không phải số chẵn thì là số lẻ
                tongLe += i;
            }
        }   
        System.out.println("Tong cac so chan tu 1 den 100 la: " + tongChan);
        System.out.println("Tong cac so le tu 1 den 100 la: " + tongLe);
    }
}
