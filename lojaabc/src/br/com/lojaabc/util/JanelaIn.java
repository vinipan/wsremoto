package br.com.lojaabc.util;

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
	
	public static boolean b (String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "TITILO", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	
	
	
}

