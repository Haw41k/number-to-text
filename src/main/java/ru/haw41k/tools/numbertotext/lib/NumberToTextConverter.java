package ru.haw41k.tools.numbertotext.lib;


import ru.haw41k.tools.numbertotext.lib.exceptions.NotValidValueException;

public interface NumberToTextConverter {

    /**
     * Преобразует число в строковое представление прописью в нужном роде и падеже
     *
     * @param nSum    преобразуемое число от 0 до 999 999 999 999
     * @param sGender род. М - мужской, Ж - женский, С - средний
     * @param sCase   падеж. И - именительный, Р - родительный, Д - дательный,
     *                В - винительный, Т - творительный, П - предложный
     */
    String sumProp(Long nSum, String sGender, String sCase) throws NotValidValueException;
}
