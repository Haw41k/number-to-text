package ru.haw41k.tools.numbertotext.lib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueCaseException;
import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueException;
import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueGenderException;
import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueNumberException;


class NumberToTextConverterTests {
    private final NumberToTextConverter nc = new NumberToTextConverterImpl();

    @Test
    void zeroTests() throws NotValidValueException {
        Assertions.assertEquals("ноль", nc.sumProp(0L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("ноля", nc.sumProp(0L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("нолю", nc.sumProp(0L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("ноль", nc.sumProp(0L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("нолём", nc.sumProp(0L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("ноле", nc.sumProp(0L, Gender.MALE, RuCase.P));
    }

    @Test
    void numberOneTests() throws NotValidValueException {
        Assertions.assertEquals("один", nc.sumProp(1L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("одно", nc.sumProp(1L, Gender.MIDDLE, RuCase.I));
        Assertions.assertEquals("одна", nc.sumProp(1L, Gender.FEMALE, RuCase.I));

        Assertions.assertEquals("одного", nc.sumProp(1L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("одного", nc.sumProp(1L, Gender.MIDDLE, RuCase.R));
        Assertions.assertEquals("одной", nc.sumProp(1L, Gender.FEMALE, RuCase.R));

        Assertions.assertEquals("одному", nc.sumProp(1L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("одному", nc.sumProp(1L, Gender.MIDDLE, RuCase.D));
        Assertions.assertEquals("одной", nc.sumProp(1L, Gender.FEMALE, RuCase.D));

        Assertions.assertEquals("один", nc.sumProp(1L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("одно", nc.sumProp(1L, Gender.MIDDLE, RuCase.V));
        Assertions.assertEquals("одну", nc.sumProp(1L, Gender.FEMALE, RuCase.V));

        Assertions.assertEquals("одним", nc.sumProp(1L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("одним", nc.sumProp(1L, Gender.MIDDLE, RuCase.T));
        Assertions.assertEquals("одной", nc.sumProp(1L, Gender.FEMALE, RuCase.T));

        Assertions.assertEquals("одном", nc.sumProp(1L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("одном", nc.sumProp(1L, Gender.MIDDLE, RuCase.P));
        Assertions.assertEquals("одной", nc.sumProp(1L, Gender.FEMALE, RuCase.P));

    }

    @Test
    void numberTwoTests() throws NotValidValueException {
        Assertions.assertEquals("два", nc.sumProp(2L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("две", nc.sumProp(2L, Gender.FEMALE, RuCase.I));
        Assertions.assertEquals("два", nc.sumProp(2L, Gender.MIDDLE, RuCase.I));

        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.FEMALE, RuCase.R));
        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.MIDDLE, RuCase.R));

        Assertions.assertEquals("двум", nc.sumProp(2L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("двум", nc.sumProp(2L, Gender.FEMALE, RuCase.D));
        Assertions.assertEquals("двум", nc.sumProp(2L, Gender.MIDDLE, RuCase.D));

        Assertions.assertEquals("два", nc.sumProp(2L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("две", nc.sumProp(2L, Gender.FEMALE, RuCase.V));
        Assertions.assertEquals("два", nc.sumProp(2L, Gender.MIDDLE, RuCase.V));

        Assertions.assertEquals("двумя", nc.sumProp(2L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("двумя", nc.sumProp(2L, Gender.FEMALE, RuCase.T));
        Assertions.assertEquals("двумя", nc.sumProp(2L, Gender.MIDDLE, RuCase.T));

        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.FEMALE, RuCase.P));
        Assertions.assertEquals("двух", nc.sumProp(2L, Gender.MIDDLE, RuCase.P));

    }

    @Test
    void numberThreeTests() throws NotValidValueException {

        Assertions.assertEquals("три", nc.sumProp(3L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("три", nc.sumProp(3L, Gender.MALE, RuCase.V));

        Assertions.assertEquals("трёх", nc.sumProp(3L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("трёх", nc.sumProp(3L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("трём", nc.sumProp(3L, Gender.MALE, RuCase.D));

        Assertions.assertEquals("тремя", nc.sumProp(3L, Gender.MALE, RuCase.T));

    }

    @Test
    void numberFourTests() throws NotValidValueException {
        Assertions.assertEquals("четыре", nc.sumProp(4L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("четыре", nc.sumProp(4L, Gender.MALE, RuCase.V));

        Assertions.assertEquals("четырёх", nc.sumProp(4L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("четырёх", nc.sumProp(4L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("четырём", nc.sumProp(4L, Gender.MALE, RuCase.D));

        Assertions.assertEquals("четырьмя", nc.sumProp(4L, Gender.MALE, RuCase.T));
    }

    @Test
    void numberFromFiveToNineTests() throws NotValidValueException {
        Assertions.assertEquals("восемь", nc.sumProp(8L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("восемь", nc.sumProp(8L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("восемью", nc.sumProp(8L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("восьми", nc.sumProp(8L, Gender.MALE, RuCase.R));

        Assertions.assertEquals("шесть", nc.sumProp(6L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("семь", nc.sumProp(7L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("девятью", nc.sumProp(9L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("шести", nc.sumProp(6L, Gender.MALE, RuCase.D));

    }

    @Test
    void numberFromTenToNineteenTests() throws NotValidValueException {
        Assertions.assertEquals("десять", nc.sumProp(10L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("одиннадцать", nc.sumProp(11L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("двенадцатью", nc.sumProp(12L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("тринадцати", nc.sumProp(13L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("четырнадцати", nc.sumProp(14L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("пятнадцати", nc.sumProp(15L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("шестнадцать", nc.sumProp(16L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("семнадцать", nc.sumProp(17L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("восемнадцатью", nc.sumProp(18L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("девятнадцати", nc.sumProp(19L, Gender.MALE, RuCase.D));

    }

    @Test
    void numberTwentyAndThirtyTests() throws NotValidValueException {
        Assertions.assertEquals("двадцать", nc.sumProp(20L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("тридцать", nc.sumProp(30L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("тридцатью", nc.sumProp(30L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("двадцати", nc.sumProp(20L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("тридцати", nc.sumProp(30L, Gender.MALE, RuCase.D));

    }

    @Test
    void numberFortyAndNinetyAndHundredTests() throws NotValidValueException {
        Assertions.assertEquals("сорок", nc.sumProp(40L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("девяносто", nc.sumProp(90L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("сто", nc.sumProp(100L, Gender.MALE, RuCase.I));

        Assertions.assertEquals("сорока", nc.sumProp(40L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("девяноста", nc.sumProp(90L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("ста", nc.sumProp(100L, Gender.MALE, RuCase.T));

    }

    @Test
    void numberFromFiftyToEightyTests() throws NotValidValueException {
        Assertions.assertEquals("пятьдесят", nc.sumProp(50L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("восемьдесят", nc.sumProp(80L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("шестьюдесятью", nc.sumProp(60L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("восьмидесяти", nc.sumProp(80L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("семидесяти", nc.sumProp(70L, Gender.MALE, RuCase.D));

    }

    @Test
    void numberFromTwoToFourHundredTests() throws NotValidValueException {
        Assertions.assertEquals("двести", nc.sumProp(200L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("триста", nc.sumProp(300L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("четыреста", nc.sumProp(400L, Gender.MALE, RuCase.I));

        Assertions.assertEquals("двухсот", nc.sumProp(200L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("трёхсот", nc.sumProp(300L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("четырёхсот", nc.sumProp(400L, Gender.MALE, RuCase.R));

        Assertions.assertEquals("двумстам", nc.sumProp(200L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("трёмстам", nc.sumProp(300L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("четырёмстам", nc.sumProp(400L, Gender.MALE, RuCase.D));

        Assertions.assertEquals("двумястами", nc.sumProp(200L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("тремястами", nc.sumProp(300L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("четырьмястами", nc.sumProp(400L, Gender.MALE, RuCase.T));

        Assertions.assertEquals("двухстах", nc.sumProp(200L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("трёхстах", nc.sumProp(300L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("четырёхстах", nc.sumProp(400L, Gender.MALE, RuCase.P));

    }

    @Test
    void numberFromFiveToNineHundredTests() throws NotValidValueException {
        Assertions.assertEquals("пятьсот", nc.sumProp(500L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("восемьсот", nc.sumProp(800L, Gender.MALE, RuCase.V));

        Assertions.assertEquals("шестисот", nc.sumProp(600L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("восьмисот", nc.sumProp(800L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("девятисот", nc.sumProp(900L, Gender.MALE, RuCase.R));

        Assertions.assertEquals("семистам", nc.sumProp(700L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("восьмистам", nc.sumProp(800L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("девятистам", nc.sumProp(900L, Gender.MALE, RuCase.D));

        Assertions.assertEquals("пятьюстами", nc.sumProp(500L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("восемьюстами", nc.sumProp(800L, Gender.MALE, RuCase.T));

        Assertions.assertEquals("шестистах", nc.sumProp(600L, Gender.MALE, RuCase.P));
        Assertions.assertEquals("восьмистах", nc.sumProp(800L, Gender.MALE, RuCase.P));


    }

    @Test
    void numberThousandTests() throws NotValidValueException {
        Assertions.assertEquals("одна тысяча", nc.sumProp(1_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("одной тысячи", nc.sumProp(1_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("одной тысяче", nc.sumProp(1_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("одну тысячу", nc.sumProp(1_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("одной тысячей", nc.sumProp(1_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("одной тысяче", nc.sumProp(1_000L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("две тысячи", nc.sumProp(2_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("трёх тысяч", nc.sumProp(3_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("трём тысячам", nc.sumProp(3_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("четыре тысячи", nc.sumProp(4_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("двумя тысячами", nc.sumProp(2_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("четырёх тысячах", nc.sumProp(4_000L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("пять тысяч", nc.sumProp(5_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("восьми тысяч", nc.sumProp(8_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("одиннадцати тысячам", nc.sumProp(11_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("двенадцать тысяч", nc.sumProp(12_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("ста тысячами", nc.sumProp(100_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("пятистах тысячах", nc.sumProp(500_000L, Gender.MALE, RuCase.P));

    }

    @Test
    void numberMillionAndBillionTests() throws NotValidValueException {
        Assertions.assertEquals("один миллион", nc.sumProp(1_000_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("одного миллиарда", nc.sumProp(1_000_000_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("одному миллиону", nc.sumProp(1_000_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("один миллиард", nc.sumProp(1_000_000_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("одним миллионом", nc.sumProp(1_000_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("одном миллиарде", nc.sumProp(1_000_000_000L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("два миллиарда", nc.sumProp(2_000_000_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("трёх миллионов", nc.sumProp(3_000_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("трём миллиардам", nc.sumProp(3_000_000_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("четыре миллиона", nc.sumProp(4_000_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("двумя миллиардами", nc.sumProp(2_000_000_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("четырёх миллионах", nc.sumProp(4_000_000L, Gender.MALE, RuCase.P));

        Assertions.assertEquals("пять миллионов", nc.sumProp(5_000_000L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("восьми миллиардов", nc.sumProp(8_000_000_000L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("одиннадцати миллионам", nc.sumProp(11_000_000L, Gender.MALE, RuCase.D));
        Assertions.assertEquals("двенадцать миллиардов", nc.sumProp(12_000_000_000L, Gender.MALE, RuCase.V));
        Assertions.assertEquals("ста миллионами", nc.sumProp(100_000_000L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("пятистах миллиардах", nc.sumProp(500_000_000_000L, Gender.MALE, RuCase.P));

    }

    @Test
    void genericTests() throws NotValidValueException {
        Assertions.assertEquals("тридцатью восемью", nc.sumProp(38L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("сорок один", nc.sumProp(41L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("девяносто одну", nc.sumProp(91L, Gender.FEMALE, RuCase.V));
        Assertions.assertEquals("восьмидесяти трёх", nc.sumProp(83L, Gender.FEMALE, RuCase.P));

        Assertions.assertEquals("сто одиннадцать", nc.sumProp(111L, Gender.FEMALE, RuCase.I));
        Assertions.assertEquals("сто одна", nc.sumProp(101L, Gender.FEMALE, RuCase.I));
        Assertions.assertEquals("ста тридцати одной", nc.sumProp(131L, Gender.FEMALE, RuCase.P));
        Assertions.assertEquals("ста пятидесяти пяти", nc.sumProp(155L, Gender.FEMALE, RuCase.P));

        Assertions.assertEquals("двумястами шестьюдесятью восемью", nc.sumProp(268L, Gender.MALE, RuCase.T));
        Assertions.assertEquals("триста двадцать четыре", nc.sumProp(324L, Gender.MALE, RuCase.I));
        Assertions.assertEquals("четыреста тринадцать", nc.sumProp(413L, Gender.FEMALE, RuCase.V));
        Assertions.assertEquals("восьмидесяти трёх", nc.sumProp(83L, Gender.FEMALE, RuCase.P));


        Assertions.assertEquals("девятьсот девяносто девять", nc.sumProp(999L, Gender.MALE, RuCase.I));

        Assertions.assertEquals(
                "три миллиарда двести четырнадцать миллионов триста пятьдесят восемь тысяч семьсот шестьдесят четыре",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.I));

        Assertions.assertEquals(
                "трёх миллиардов двухсот четырнадцати миллионов трёхсот пятидесяти восьми тысяч семисот шестидесяти четырёх",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.R));

        Assertions.assertEquals(
                "трём миллиардам двумстам четырнадцати миллионам трёмстам пятидесяти восьми тысячам семистам шестидесяти четырём",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.D));

        Assertions.assertEquals(
                "три миллиарда двести четырнадцать миллионов триста пятьдесят восемь тысяч семьсот шестьдесят четыре",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.V));

        Assertions.assertEquals(
                "тремя миллиардами двумястами четырнадцатью миллионами тремястами пятьюдесятью восемью тысячами семьюстами шестьюдесятью четырьмя",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.T));

        Assertions.assertEquals(
                "трёх миллиардах двухстах четырнадцати миллионах трёхстах пятидесяти восьми тысячах семистах шестидесяти четырёх",
                nc.sumProp(3_214_358_764L, Gender.MALE, RuCase.P));
    }

    @Test
    void TaskValuesTests() throws NotValidValueException {
        Assertions.assertEquals("тридцати одного", nc.sumProp(31L, Gender.MALE, RuCase.R));
        Assertions.assertEquals("двадцатью двумя", nc.sumProp(22L, Gender.MIDDLE, RuCase.T));
        Assertions.assertEquals(
                "сто пятьдесят четыре тысячи триста двадцать три",
                nc.sumProp(154_323L, Gender.MALE, RuCase.I)
        );
        Assertions.assertEquals(
                "ста пятьюдесятью четырьмя тысячами тремястами двадцатью тремя",
                nc.sumProp(154_323L, Gender.MALE, RuCase.T)
        );

    }

    @Test
    void ExceptionTests() {
        Assertions.assertThrows(NotValidValueCaseException.class, () -> nc.sumProp(1L, Gender.MALE, "#"));
        Assertions.assertThrows(NotValidValueGenderException.class, () -> nc.sumProp(1L, "#", RuCase.I));
        Assertions.assertThrows(NotValidValueNumberException.class, () -> nc.sumProp(-1L, Gender.MALE, RuCase.I));
    }

}