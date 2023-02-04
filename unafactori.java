package unafactori;

import java.util.Scanner;

public static long fact(long num) {
	if (num<=0) {
	return 1;
	} else {
	return num*fact(num-1);
	}
	}
}
