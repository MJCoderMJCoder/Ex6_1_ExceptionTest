package com.exceptiontest;
/*
 * try {
 * 		//可能发生的异常快
 * } catch (Exception e) {
 * 		//处理Exception e异常的语句块
 * } finally {
 * 		//无论异常是否发生都一定执行的语句块
 * }
 */
public class ExceptionTest {

	public static void main(String[] args) {
		int i = 0;
		String str[] = {"One", "Two", "Three"};
		try {
			while(i <=3) {
				System.out.println(str[i]);	//数组下标越界
				i++;
			}
		} catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界异常");
		} finally {
			System.out.println("finally i=" + i);
		}
		System.out.println("程序正常结束");
	}

}
