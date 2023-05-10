package utils;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utilitarios {
	static NumberFormat formatandoNumeros = new DecimalFormat("R$ #,##0.00");
    static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date data) {
        return utilitarios.formatandoData.format(data);
    }

    public static String doubleToString(Double valor) {
        return utilitarios.formatandoNumeros.format(valor);
    }

}

