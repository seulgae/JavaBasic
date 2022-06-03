package com.seulgae.ch06;

class Data1 {
	int value;
//	Data1(){}
	// 컴파일러가 자동으로 넣어줌.
}

class Data3 {
	int value;

//	Data3(){} 
	Data3(int x) { // 매개변수가 있는 생성자.
		value = x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data3 d2 = new Data3();		// compile error발생
		Data3 d2 = new Data3(10); // compile error발생
	}
}