package ru.haw41k.tools.numbertotext;

import ru.haw41k.tools.numbertotext.lib.NumberToTextConverter;
import ru.haw41k.tools.numbertotext.lib.NumberToTextConverterImpl;
import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueException;

public class App {
    private static final NumberToTextConverter nc = new NumberToTextConverterImpl();

    public static void main(String[] args) {

        if (args.length < 3) {
            System.err.println("Параметры заданы неверно");
            return;
        }

        try {
            Long number = Long.parseLong(args[0]);
            String result = nc.sumProp(number, args[1], args[2]);

            System.out.println(result);

        } catch (NotValidValueException e) {
            System.err.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.err.println("Не удалось распознать число: " + args[0]);
        }
    }
}
