package com.algorithm.math;

import java.util.ArrayList;
import java.util.List;

public class Zhishu {

	public static void main(String[] args) {

		List<Integer> resultList = new ArrayList<Integer>();
		// resultList.add(1);
		// resultList.add(2);
		int count = 0;
		for (int i = 3; i <= 1000; i = i + 2) {
			boolean flag = true;
			// for (int j = 2; j <= Math.sqrt(i); j++) {
			// count++;
			// if (i % j != 0) {
			// continue;
			// } else {
			// flag = false;
			// break;
			// }
			//
			// }

			for (Integer j : resultList) {
				count++;
				if (i % j != 0) {
					continue;
				} else {
					flag = false;
					break;
				}

			}
			if (flag) {
				resultList.add(i);
			}
		}

		for (Integer num : resultList) {
			System.out.print("num:" + num + ",");
		}
		System.out.println();
		System.out.println("count:" + count);
	}
}
