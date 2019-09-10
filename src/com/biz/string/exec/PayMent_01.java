package com.biz.string.exec;

public class PayMent_01 {

	public static void main(String[] args) {

		int pay = 3785870;
		int mo = 50000;
		int won = 1;

		int count = 0;
		while (true) {

			count = (int) (pay / mo);
			System.out.printf("%d원 : %d매\n", mo, count);

			if (mo <= 1)
				break;

			pay = pay - count * mo;

			if (won == 1) {

				mo = mo / 5;
				won = 0;

			} else {

				mo = mo / 2;
				won = 1;

			}

		}

	}

}