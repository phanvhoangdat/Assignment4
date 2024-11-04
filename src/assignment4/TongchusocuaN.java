/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;
import java.util.Scanner;

public class TongchusocuaN {public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		int n = sc.nextInt() ; 
		int sum = 0 ; 
		while (n != 0) {
			int mod = n % 10 ; 
			sum += mod ; 
			n /= 10 ; 
		}
		System.out.println(sum);
	}
}

/* 
	b1:  n = 123 ; 
	b2: kiểm tra lệnh while có thỏa mãn điều kiện không 
		b2.1: tạo biến mod để lưu phần dư của n : 123 % 10  = 3 
		b2.2: sum = sum + mod = 0 + 3 = 3 ; 
		b2.3: cập nhật lại n bằng chia lấy phần nguyên n /= 10 => 123 / 10 = 12 => n = 12 
		...
		tiếp tục kiểm tra đến khi n bằng 0 ; 
	b3: in giá trị sum
*/