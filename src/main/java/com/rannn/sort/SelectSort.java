package com.rannn.sort;

/**
 * 选择排序 - 不稳定
 * @author 哓哓
 *
 */
public class SelectSort {
	public void selectSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			if (k!=i) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}
}