package dictionary;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Dictionary td=new Dictionary();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào từ khóa để tìm");
        String nhap=sc.nextLine();
        td.Tratu(nhap);
        }

    }
