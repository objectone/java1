package zvm89_15_05_2016;

import static java.lang.System.out;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		String s1 = "Привет строковое значение";
		out.println("s1 = " + s1);
		
		String s2 = new String("новая строка");
		out.println("s2 = " + s2);
		
		char ch = s1.charAt(2);
		out.println("char ch = s1.charAt(0); = " + ch);
		
		/*
		//plohoe_reshenie
		String r = "";
		for(int i=1; i<=50; i++){
			r += String.valueOf(i)+ " ";
		}
		out.println(r);
		*/
		
		//horoshee_reshenie_optimalnyy_kod_ispolzovat_klass_tipa_string_bilder
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=50; i++){
		//append_zamenyaet_operaciyu_konkatenacii
			sb.append(i).append(" -");
		}
		//perevedem_v_strokovoe_znachenie
		String r = sb.toString();
		out.println(sb);
		out.println(r);
		
		//kak_sravnivayutsya_stroki
		//importiruem_biblioteku_sozdaem_skanner
		/*
		Scanner sc = new Scanner(System.in);
		out.print("Введите строку: ");
		String s = sc.nextLine();
		out.println(s);
		
		String s3 = "zvm89";
		boolean rs = (s.equals(s3));
		out.println("результат сравнения = " + s + " и " + s3 + " дает: " + rs);
		*/
		
		//privet_v_sisteme_odin_a_ssylki_na_nego_dve
		//String st1 = "Привет"; //true
		String st1 = new String("Привет"); //false
//		String st1 = "При" + "вет"; //true
//		String st1_1 = "вет";
//		String st1 = "При"+st1_1; //false
		String st2 = "Привет";
		
		boolean znachenie_sravneniya_dvuh_strokovyh_peremennyh = (st1 == st2);
		
		out.println(st1 + " " + st2 + " = " + znachenie_sravneniya_dvuh_strokovyh_peremennyh);
		
		{
			int a = 5;
			int b = 7;
			out.printf("a = %d;\nb = %d\n", a,b); // %d - целочисленное значение
			
			String name = "Владимир";
			String formatirovannoe_imya = String.format("Привет %s!", name); //Format String Syntax - https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
			out.println(formatirovannoe_imya);
		}
		
		{
			double dbl1 = 25.0;
			double dbl2 = 1.5;
			
			out.printf("dbl1 = %2f dbl2 = %1f\n", dbl1, dbl2);
//			out.printf("dbl1 = %2$f dbl2 = %1$f\n", dbl1, dbl2);
			
//			import java.util.Date;
			Date now = new Date();
			out.printf("%1$td-%1$tB-%1$tY", now);
		}
	}
}