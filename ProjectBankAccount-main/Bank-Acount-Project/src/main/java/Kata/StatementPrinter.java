package Kata;


import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatementPrinter {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void print(List<Transaction> transactions) {
        System.out.println("DATE       | AMOUNT  | BALANCE");
        List<Transaction> reversed = new ArrayList<>(transactions);
        Collections.reverse(reversed);
        for (Transaction t : reversed) {
            System.out.printf("%s | %+7d | %7d\n",
                t.getDate().format(FORMATTER),
                t.getAmount(),
                t.getBalance()
            );
        }
    }
}
