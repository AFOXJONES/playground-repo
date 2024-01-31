package numerosYPrecios;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;
public class Dinero {
	public static void main(String[] args) {
		BigDecimal presupuesto= new BigDecimal(2323.3434);
		BigDecimal suma=presupuesto.add(new BigDecimal(3244.3));
		
		NumberFormat formatter=NumberFormat.getCurrencyInstance(Locale.US);
		
		String dollar=formatter.format(suma);
		
		Currency currency=formatter.getCurrency();
		
		System.out.println(currency.getCurrencyCode()+" "+currency.getDisplayName()+" "+currency.getSymbol());
		System.out.println(dollar);
	}

}
