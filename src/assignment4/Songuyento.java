/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

public class Songuyento {

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1 - 100 : ");
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Số nguyên tố bắt đầu từ 2
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Nếu có ước số khác 1 và chính nó, không phải số nguyên tố
            }
        }
        return true; // Nếu không tìm thấy ước số, thì là số nguyên tố
    }

}
