package br.com.bankofoz.util;

import javax.swing.JOptionPane;

public class JanelaIn {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i (String msg) {
		return 	Integer.parseInt(s(msg));
	}

	public static float f (String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static short sh (String msg) {
		return Short.parseShort(s(msg));
	}
	
	public static byte b (String msg) {
		return Byte.parseByte(s(msg));
	}
	
	public static boolean bo (String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "E AI?", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}

