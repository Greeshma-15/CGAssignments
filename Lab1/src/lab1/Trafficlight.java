package lab1;

import java.util.Scanner;

public class Trafficlight {
	public static Scanner sc;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select one : red green yellow");
		String name = sc.next();

		switch (name) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default:
			System.out.println("invalid");
		}
	}
}
