package lad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arraydsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ประกาศตัวแปร
        int[] x = {1, 4, 23, 7, 82, 12, 43, 21, 36, 3};
        char[] y = {'a', 'b', 'c'};
        char[] fnameChar = new char[20]; // สมมติว่าชื่อนิสิตยาวไม่เกิน 20 ตัวอักษร
        String fnameString; // เก็บชื่อนิสิตแบบ string
        boolean[] bool1 = {true, false, true, false, false};
        float[] f = {0.11030885f, 0.30249763f, 0.25212837f, 0.17135252f, 0.24648858f, 0.84376765f};

        // แสดงขนาดของอาร์เรย์
        System.out.println("ขนาดของอาร์เรย์ x: " + x.length);
        System.out.println("ขนาดของอาร์เรย์ y: " + y.length);
        System.out.println("ขนาดของอาร์เรย์ bool1: " + bool1.length);
        System.out.println("ขนาดของอาร์เรย์ f: " + f.length);
// แสดงแอดเดรสเริ่มต้นและสิ้นสุดของตัวแปร
        System.out.println("แอดเดรสเริ่มต้นของ x: " + Arrays.hashCode(x));
        System.out.println("แอดเดรสสิ้นสุดของ x: " + (Arrays.hashCode(x) + x.length - 1));

        System.out.println("แอดเดรสเริ่มต้นของ y: " + Arrays.hashCode(y));
        System.out.println("แอดเดรสสิ้นสุดของ y: " + (Arrays.hashCode(y) + y.length - 1));

        System.out.print("กรุณาป้อนชื่อนิสิต: ");
        try (Scanner scanner = new Scanner(System.in)) {
			fnameChar = scanner.nextLine().toCharArray();
		}
        // แสดงขนาดของ fnameChar
        System.out.println("ขนาดของ fnameChar: " + fnameChar.length);

        // แสดงแอดเดรสเริ่มต้นของ fnameChar
        System.out.println("แอดเดรสเริ่มต้นของ fnameChar: " + Arrays.hashCode(fnameChar));

        // แสดงแอดเดรสสิ้นสุดของ fnameChar
        System.out.println("แอดเดรสสิ้นสุดของ fnameChar: " + (Arrays.hashCode(fnameChar) + fnameChar.length - 1));

        // แปลง fnameChar เป็น fnameString
        fnameString = new String(fnameChar);

        // แสดงขนาดของ fnameString
        System.out.println("ขนาดของ fnameString: " + fnameString.length());

        // แสดงแอดเดรสเริ่มต้นของ fnameString
        System.out.println("แอดเดรสเริ่มต้นของ fnameString: " + System.identityHashCode(fnameString));

        // แสดงแอดเดรสสิ้นสุดของ fnameString
        System.out.println("แอดเดรสสิ้นสุดของ fnameString: " + (System.identityHashCode(fnameString) + fnameString.length() - 1));
	}

}
