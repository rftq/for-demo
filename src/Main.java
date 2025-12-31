public class Main {
    public static void main(String[] args) {
        // Вложенные циклы
        int borderSize = 3; // унифицировали код, создав переменную, которая конфигурирует
        int imageSize = 10; // унифицировали код, создав переменную, которая конфигурирует
        for (int y = 0; y < imageSize; y++) {  // y - номер строки
            for (int xx = 0; xx < imageSize; xx++) {   // x - номер столбца
                if (y > 2 && y < 7 && xx > 2 && xx < 7) {
                    // if (y > borderSize - 1 && y < imageSize - borderSize && x > borderSize -1 && x < imageSize - borderSize)
                    // выводим различные вариации 0 и *, используя координаты xx и y, либо добавили borderSize и imageSize
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();

        System.out.println("--------------------------");

        // Нарисуем шахматную доску
        int imageSize2 = 10;
        int radius = 7;
        for (int y = 0; y < imageSize2; y++) {  // y - номер строки
            for (int xx = 0; xx < imageSize2; xx++) {   // x - номер столбца
                if ((xx + y) % 2 == 0) {
                    // или квадратное поле
                    // if (((xx / 4) + (y / 4)) % 2 == 0) при размере поля 20
                    // if (((xx / 2) + (y / 2)) % 2 == 0) при размере поля 10

                    // можно нарисовать кружочек
                    // if ((xx - imageSize2 / 2) * (xx - imageSize2 / 2) + (y - imageSize2 / 2) * (y - imageSize2 / 2) < radius * radius)
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        // Базовый пример, чтобы нарисовать, чтобы разобраться как работать с координатами во вложенном цикле
        int imgSize = 5;
        for (int yyy = 0; yyy < imgSize; yyy++) {  // y - номер строки
            for (int xxx = 0; xxx < imgSize; xxx++) {   // x - номер столбца
                // Например:
                // if (xxx > 0 && xxx < 5 && yyy > 0 && yyy < 4) {
                // System.out.print("0");
                // } else {
                // System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        // Домашнее задание:
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000
        // *****00000

        int fieldSize1 = 10;
        for (int y1 = 0; y1 < fieldSize1; y1++) {  // y - номер строки
            for (int x1 = 0; x1 < fieldSize1; x1++) {   // x - номер столбца
                if (x1 < 5) {   // y1 < 5, чтобы разделить по строкам
                    System.out.print("x");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //*********0
        //*********0
        //0000000000
        //*********0
        //*********0
        //*********0
        //*********0
        //*********0
        //*********0
        //*********0
        //*********0

        int fieldSize2 = 10;
        for (int y2 = 0; y2 < fieldSize2; y2++) {  // y - номер строки
            for (int x2 = 0; x2 < fieldSize2; x2++) {   // x - номер столбца
                if ((x2 < fieldSize2 - 1 && y2 > 1 && y2 < 3) || x2 > fieldSize2 - 2) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //**********
        //**0000****
        //**0000****
        //**0000****
        //*****0000*
        //**********
        //*****000**
        //*****000**
        //*****000**
        //**********

        int fieldSize3 = 10;
        for (int y3 = 0; y3 < fieldSize3; y3++) {  // y - номер строки
            for (int x3 = 0; x3 < fieldSize3; x3++) {   // x - номер столбца
                if ((x3 > 1 && x3 < 6 && y3 > 0 && y3 < 4) || (x3 > 4 && x3 < 9 && y3 > 3 && y3 < 5) || (x3 > 4 && x3 < 8 && y3 > 5 && y3 < 9)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //**********
        //0*********
        //00********
        //000*******
        //0000******
        //00000*****
        //000000****
        //0000000***
        //00000000**
        //000000000*

        int fieldSize4 = 10;
        for (int y4 = 0; y4 < fieldSize4; y4++) {  // y - номер строки
            for (int x4 = 0; x4 < fieldSize4; x4++) {   // x - номер столбца
                if (x4 > y4) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //*000000000
        //0*00000000
        //00*0000000
        //000*000000
        //0000*00000
        //00000*0000
        //000000*000
        //0000000*00
        //00000000*0
        //000000000*

        int fieldSize5 = 10;
        for (int y5 = 0; y5 < fieldSize5; y5++) {  // y - номер строки
            for (int x5 = 0; x5 < fieldSize5; x5++) {   // x - номер столбца
                if (x5 == y5) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //0********0
        //*0******0*
        //**0****0**
        //***0**0***
        //****00****
        //****00****
        //***0**0***
        //**0****0**
        //*0******0*
        //0********0

        int fieldSize6 = 10;
        for (int y6 = 0; y6 < fieldSize6; y6++) {  // y - номер строки
            for (int x6 = 0; x6 < fieldSize6; x6++) {   // x - номер столбца
                if (x6 == y6 || x6 == fieldSize6 - y6 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        //00********
        //000*******
        //*000******
        //**000*****
        //***000****
        //****000***
        //*****000**
        //******000*
        //*******000
        //********00

        int fieldSize7 = 10;
        for (int y7 = 0; y7 < fieldSize7; y7++) {  // y - номер строки
            for (int x7 = 0; x7 < fieldSize7; x7++) {   // x - номер столбца
                if (x7 == y7) {
                    for (int i = 0; i < 3; i++) {
                        System.out.print("0");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}