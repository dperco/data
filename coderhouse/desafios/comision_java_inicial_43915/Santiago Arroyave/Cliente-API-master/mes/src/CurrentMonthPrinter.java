import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CurrentMonthPrinter {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String month = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("El mes actual es: " + month);
    }
}
