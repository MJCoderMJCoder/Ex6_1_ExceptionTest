package com.exceptiontest;
/*
 * try {
 * 		//���ܷ������쳣��
 * } catch (Exception e) {
 * 		//����Exception e�쳣������
 * } finally {
 * 		//�����쳣�Ƿ�����һ��ִ�е�����
 * }
 */
public class ExceptionTest {

	public static void main(String[] args) {
		int i = 0;
		String str[] = {"One", "Two", "Three"};
		try {
			while(i <=3) {
				System.out.println(str[i]);	//�����±�Խ��
				i++;
			}
		} catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ���쳣");
		} finally {
			System.out.println("finally i=" + i);
		}
		System.out.println("������������");
	}

}
