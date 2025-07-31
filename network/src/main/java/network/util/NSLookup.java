package network.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			while (true) {
				System.out.println(">> ");
				String line = scanner.nextLine();

				if ("quit".equals(line)) {
					break;
				}

				InetAddress[] InetAddresses = InetAddress.getAllByName(line);
				System.out.println(InetAddresses.length);
			}
		} catch (UnknownHostException ex) {
			System.out.println("알려진 호스트가 없습니다.");
		} finally {
			scanner.close();
		}

	}

}
