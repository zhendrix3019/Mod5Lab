package edu.wctc.isp.solution.part2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Instructor Solution 2");

        edu.wctc.isp.solution.part2.Product book1 = new edu.wctc.isp.solution.part2.HardcoverBook("The Hunger Games", "9780439023528",
                8.79, 12,
                LocalDate.of(2010, Month.JULY, 3),
                "Suzanne Collins", 384);
        edu.wctc.isp.solution.part2.Product book2 = new edu.wctc.isp.solution.part2.PaperbackBook("A Wrinkle in Time", "9780312367541",
                6.19, 4,
                LocalDate.of(2007, Month.MAY, 1),
                "Madeleine L'Engle", 256);
        edu.wctc.isp.solution.part2.Product record = new edu.wctc.isp.solution.part2.VinylRecord("Kind of Blue",
                13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46));

        List<edu.wctc.isp.solution.part2.Product> products = new ArrayList<>();
        products.add(book1);
        products.add(book2);
        products.add(record);

        for (edu.wctc.isp.solution.part2.Product product : products) {
            System.out.println(product.toString());
            System.out.println("\n");
        }
    }
}