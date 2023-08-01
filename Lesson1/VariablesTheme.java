public class VariablesTheme {

    public static void main (String[] args) {
        // TODO: 1. Вывод характеристик компьютера
        byte coreAmount = 4;
        short ram = 16;
        int diskSpace = 356;
        long videoMemory = 2048;
        float coreFrequency = 3.1f;
        double osBuild = 19045.3208;
        char pcName = 'a';
        boolean license = true;
        System.out.println("1. Вывод характеристик компьютера");
        System.out.println("    Количество ядер процессора - " + coreAmount);
        System.out.println("    Частота - " + coreFrequency + "GHz");
        System.out.println("    Оперативная память - " + ram + "GB");
        System.out.println("    Свободное место на диске - " + diskSpace + "GB");
        System.out.println("    Объем видеопамяти - " + videoMemory + "MB");
        System.out.println("    Сборка Windows 10 - " + osBuild);
        System.out.println("    Лицензия - " + license);
        System.out.println("    Имя компьютера - " + pcName + "\n");

        // TODO: 2. Расчет стоимости товара со скидкой
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int priceTotal = penPrice + bookPrice;
        int discountAmount = priceTotal * discount / 100;
        int priseDiscounted = priceTotal - discountAmount;
        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.println("    Общая стоимость товаров - " + priceTotal + " рублей");
        System.out.println("    Сумма скидки - " + discountAmount + " рублей");
        System.out.println("    Стоимость со скидкой - " + priseDiscounted + " рублей\n");

        // TODO: 3. Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA \n");
        System.out.println("       J    a  v     v  a     ");
        System.out.println("       J   a a  v   v  a a    ");
        System.out.println("    J  J  aaaaa  V V  aaaaa   ");
        System.out.println("     JJ  a     a  V  a     a \n");

        // TODO: 4. Вывод min и max значений целых числовых типов
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2_147_483_647;
        long longNum = 9_223_372_036_854_775_807L;
        System.out.println("4. Вывод min и max значений целых числовых типов");
        System.out.println("    byte \n    " + byteNum + " " + ++byteNum + " " + --byteNum + "\n");
        System.out.println("    short \n    " + shortNum + " " + ++shortNum + " " + --shortNum +
                 "\n");
        System.out.println("    int \n    " + intNum + " " + ++intNum + " " + --intNum + "\n");
        System.out.println("    long \n    " + longNum + " " + ++longNum + " " + --longNum + "\n");


        // TODO: 5. Перестановка значений переменных
        int num1, num2;
        num1 = 5;
        num2 = 7;
        System.out.println("5. Перестановка значений переменных");
        System.out.println("    Перестановка с помощью 3й переменной");
        System.out.println("    Исходные значения: " + num1 + " и " + num2);
        int num3=num1;
        num1 = num2;
        num2 = num3;
        System.out.println("    Новые значения: " + num1 + " и " + num2 + "\n");
        System.out.println("    Перестановка с помощью арифметических операций");
        System.out.println("    Исходные значения: " + num1 + " и " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("    Новые значения: " + num1 + " и " + num2 + "\n");
        System.out.println("    Перестановка с помощью побитовой операции ^");
        System.out.println("    Исходные значения: " + num1 + " и " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("    Новые значения: " + num1 + " и " + num2 + "\n");

        // TODO: 6. Вывод символов и их кодов
        char sym1 = 36;
        char sym2 = 42;
        char sym3 = 62;
        char sym4 = 124;
        char sym5 = 126;
        System.out.println("6. Вывод символов и их кодов");
        System.out.println("    " + (int) sym1 + " " +sym1);
        System.out.println("    " + (int) sym2 + " " +sym2);
        System.out.println("    " + (int) sym3 + " " +sym3);
        System.out.println("    " + (int) sym4 + " " +sym4);
        System.out.println("    " + (int) sym5 + " " +sym5 + "\n");

        // TODO: 7. Вывод в консоль ASCII-арт Дюка
        char duke1 = '/';
        char duke2 = 92;
        char duke3 = '_';
        char duke4 = '(';
        char duke5 = ')';
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        System.out.println("        " + duke1 + duke2 + "    ");
        System.out.println("       " + duke1 + "  " + duke2 + "   ");
        System.out.println("      " + duke1 + duke3 + duke4 + " " + duke5 + duke2 + "  ");
        System.out.println("     " + duke1 + "      " + duke2 + " ");
        System.out.println("    " + duke1 + duke3 + duke3 + duke3 + duke3 + duke1 + duke2 + duke3 +
                duke3 + duke2 + "\n");


        // TODO: 8. Вывод количества сотен, десятков и единиц числа
        int num8 = 123;
        int numUnits = num8 % 10;
        int numDozens = num8 / 10 % 10;
        int numHundreds = num8 / 100;
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        System.out.println("    Число " + num8 + " содержит:");
        System.out.println("        сотен - " + numHundreds);
        System.out.println("        десятков - " + numDozens);
        System.out.println("        единиц - " + numUnits + "\n");

        // TODO: 9. Вывод времени
        int time = 86399;
        int timeHrs = time / 3600;
        int timeMins = time / 60 % 60;
        int timeSecs = time % 60;
        System.out.println("9. Вывод времени");
        System.out.println("    " + time + " секунд это");
        System.out.println("    " + timeHrs + ":" + timeMins + ":" + timeSecs);
    }
}