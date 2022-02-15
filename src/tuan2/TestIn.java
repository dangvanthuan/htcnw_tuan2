package tuan2;

import java.util.GregorianCalendar;

public class TestIn {

	public static void main(String[] args) {
		SinhVien h1= new SinhVien("12345678","Lý Con Kiến", 30, new GregorianCalendar(2000, 9, 12));
		SinhVien h2= new SinhVien("11111111","Lý Con Vịt", 45, new GregorianCalendar(1999, 9, 13));
		
		h1.tieuDe();
		System.out.println(h1);
		System.out.println(h2);
	}

}
