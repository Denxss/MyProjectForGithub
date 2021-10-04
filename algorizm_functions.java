package MyProjectForGithub;

import java.util.InputMismatchException;
import java.util.Scanner;

public class algorizm_functions {
    public static void main(String[] args) {
        int g = 0;
        while (g < 120) {
            g++;
            //jhbh
            try {


                Scanner menu = new Scanner(System.in);
                System.out.println("Добрый день! Вас приветствует программа по работе алгоритмов. Для работы с алгоритмами выберите пункт меню:\n 1) Для того что бы поработать с условными конструкциями нажмите 1.\n 2) Для того что бы поработать с массивами нажмите 2." +
                        "\n 3) Для того что бы поработать с текстом и инверсией нажмите 3.\n 4) Для того что бы поработать  с циклами нажмите 4. \n Для завершения работы нажмите 0");
                int vybor = menu.nextInt();
                if (vybor == 1) {
                    System.out.println("Выберите задачу: \n 1.Сравнение числа-Больше 5 меньше 10. \n 2. Банковский вклад.\n 3. Выбор Арифметической операции. \n 4.Арифметическая операция. \n 5.Валютные переводы. \n 6. Операции со временем. \n 7.Арифметические операции+сравнение.\n " +
                            "0 для выхода в предыдущее меню ");
                    int vybor1 = menu.nextInt();
                    if (vybor1 == 1) {
                        System.out.println(chislo());
                    } else if (vybor1 == 2) {
                        bank();
                        continue;
                    } else if (vybor1 == 3) {
                        System.out.println(arifmetika());
                        continue;
                    } else if (vybor1 == 4) {
                        arifmetik_Operacii();
                        continue;
                    } else if (vybor1 == 5) {
                        valuta();
                        continue;
                    } else if (vybor1 == 6) {
                        System.out.println(vremya());
                        continue;
                    } else if (vybor1 == 7) {
                        arifmetika_Sravnenie();
                        continue;
                    } else if (vybor1 == 0) {
                        System.out.println(scanner());
                    }
                }
                if (vybor == 2) {
                    System.out.println("Выберите задачу:\n 1. Вернуть общие элементы массивов. \n 2. Полинодром \n 3. Объединение массивов. \n 4. Вывод четных чисел до числа 237. \n 5. Вывод элементов из 1 массива которых нет во 2м. \n 6. Сколько раз встречается число в массиве.\n " +
                            "0 для выхода в предыдущее меню");
                    int vybor2 = menu.nextInt();
                    if (vybor2 == 1) {
                        massive();
                        continue;
                    } else if (vybor2 == 2) {
                        polinodrom();
                        continue;
                    } else if (vybor2 == 3) {
                        massive_Plus_Massive();
                        continue;
                    } else if (vybor2 == 4) {
                        stop_Massive();
                        continue;
                    } else if (vybor2 == 5) {
                        elements();
                        continue;
                    } else if (vybor2 == 6) {
                        System.out.println(chetverka());
                        continue;
                    } else if (vybor2 == 0) {
                        System.out.println(scanner());
                    }
                }
                if (vybor == 3) {
                    System.out.println("Выберите задачу: \n 1. Сочинение обо мне \n 2. Сочинение о тебе. \n 3. Инверсия.\n 0 для выхода в предыдущее меню.");
                    int vybor3 = menu.nextInt();
                    if (vybor3 == 1) {
                        sochinenie();
                        continue;
                    } else if (vybor3 == 2) {
                        sochinenie_O_Tebe();
                        continue;
                    } else if (vybor3 == 3) {
                        inversiya();
                        continue;
                    } else if (vybor3 == 0) {
                        System.out.println(scanner());
                    }
                }
                if (vybor == 4) {
                    System.out.println("Выберите задачу:\n 1.Насление спустя 10 лет \n 2. Население с изм. показателями \n 3. Банковский вклад.\n 4. Банковский вклад через while. \n 5. Таблица умножения. \n 6. Умножение \n 7. Фибоначи \n 8. Факториал. \n 9.Вывод треугольника.\n " +
                            "0 для выхода в предыдущее меню.");
                    int vybor4 = menu.nextInt();
                    if (vybor4 == 1) {
                        naselenie();
                        continue;
                    } else if (vybor4 == 2) {
                        naseleniee();
                        continue;
                    } else if (vybor4 == 3) {
                        vklad();
                        continue;
                    } else if (vybor4 == 4) {
                        vklad_while();
                        continue;
                    } else if (vybor4 == 5) {
                        tablica_umnogeniya();
                        continue;
                    } else if (vybor4 == 6) {
                        umnogenie();
                        continue;
                    } else if (vybor4 == 7) {
                        System.out.println(fibonachi());
                        continue;
                    } else if (vybor4 == 8) {
                        faktorial();
                        continue;
                    } else if (vybor4 == 9) {
                        treugolnik();
                        continue;
                    } else if (vybor4 == 0) {
                        System.out.println(scanner());
                    }
                }
                if (vybor == 0) {
                    System.out.println("Спасибо что воспользовались программой. Хорошего вам дня!");
                    break;
                }
            }
            catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("Вы обратились к индексу которого не существует");
                //System.out.println(ai.getMessage());
                //ai.printStackTrace();
            }
            catch (InputMismatchException inputMismatchException){
                System.out.println("Вводимые данные должны быть только числами");
            }
            catch (Exception exception){
                System.out.println("error cabridge");
            }
            finally {
                System.out.println("Good");
            }
//        sochinenie();
//        sochinenie_O_Tebe();
//        inversiya();
//        System.out.println(chislo());
//        bank();
//        System.out.println(arifmetika());
//        arifmetik_Operacii();
//        valuta();
//        System.out.println(vremya());
//        arifmetika_Sravnenie();
//        naselenie();
//        naseleniee();
//        vklad();
//        vklad_while();
//        tablica_umnogeniya();
//        umnogenie();
//        System.out.println(fibonachi());
//        faktorial();
//        treugolnik();
//        massive();
//        polinodrom();
//        massive_Plus_Massive();
//        stop_Massive();
//        elements();
//        System.out.println(chetverka());
        }
    }

    static Scanner scanner() {
        Scanner menu = new Scanner(System.in);
        System.out.println("Добрый день! Вас приветствует программа по работе алгоритмов. Для работы с алгоритмами выберите пункт меню:\n 1) Для того что бы поработать с условными конструкциями нажмите 1.\n 2) Для того что бы поработать с массивами нажмите 2." +
                "\n 3) Для того что бы поработать с текстом и инверсией нажмите 3.\n 4) Для того что бы поработать  с циклами нажмите 4.");
        int vybor = menu.nextInt();
        if (vybor == 1) {
            System.out.println("Выберите задачу: \n 1.Сравнение числа-Больше 5 меньше 10. \n 2. Банковский вклад.\n 3. Выбор Арифметической операции. \n 4.Арифметическая операция. \n 5.Валютные переводы. \n 6. Операции со временем. \n 7.Арифметические операции+сравнение.\n " +
                    "0 для выхода в предыдущее меню ");
            int vybor1 = menu.nextInt();
            if (vybor1 == 1) {
                System.out.println(chislo());
                return scanner();
            } else if (vybor1 == 2) {
                bank();
            } else if (vybor1 == 3) {
                System.out.println(arifmetika());
            } else if (vybor1 == 4) {
                arifmetik_Operacii();
            } else if (vybor1 == 5) {
                valuta();
            } else if (vybor1 == 6) {
                System.out.println(vremya());
            } else if (vybor1 == 7) {
                arifmetika_Sravnenie();
            } else if (vybor1 == 0) {
                System.out.println(scanner());
            }
        }
        if (vybor == 2) {
            System.out.println("Выберите задачу:\n 1. Вернуть общие элементы массивов. \n 2. Полинодром \n 3. Объединение массивов. \n 4. Вывод четных чисел до числа 237. \n 5. Вывод элементов из 1 массива которых нет во 2м. \n 6. Сколько раз встречается число в массиве.\n " +
                    "0 для выхода в предыдущее меню");
            int vybor2 = menu.nextInt();
            if (vybor2 == 1) {
                massive();
            } else if (vybor2 == 2) {
                polinodrom();
            } else if (vybor2 == 3) {
                massive_Plus_Massive();
            } else if (vybor2 == 4) {
                stop_Massive();
            } else if (vybor2 == 5) {
                elements();
            } else if (vybor2 == 6) {
                System.out.println(chetverka());
            } else if (vybor2 == 0) {
                System.out.println(scanner());
            }
        }
        if (vybor == 3) {
            System.out.println("Выберите задачу: \n 1. Сочинение обо мне \n 2. Сочинение о тебе. \n 3. Инверсия.\n 0 для выхода в предыдущее меню.");
            int vybor3 = menu.nextInt();
            if (vybor3 == 1) {
                sochinenie();
            } else if (vybor3 == 2) {
                sochinenie_O_Tebe();
            } else if (vybor3 == 3) {
                inversiya();
            } else if (vybor3 == 0) {
                System.out.println(scanner());
            }
        }
        if (vybor == 4) {
            System.out.println("Выберите задачу:\n 1.Насление спустя 10 лет \n 2. Население с изм. показателями \n 3. Банковский вклад.\n 4. Банковский вклад через while. \n 5. Таблица умножения. \n 6. Умножение \n 7. Фибоначи \n 8. Факториал. \n 9.Вывод треугольника.\n " +
                    "0 для выхода в предыдущее меню.");
            int vybor4 = menu.nextInt();
            if (vybor4 == 1) {
                naselenie();
            } else if (vybor4 == 2) {
                naseleniee();
            } else if (vybor4 == 3) {
                vklad();
            } else if (vybor4 == 4) {
                vklad_while();
            } else if (vybor4 == 5) {
                tablica_umnogeniya();
            } else if (vybor4 == 6) {
                umnogenie();
            } else if (vybor4 == 7) {
                System.out.println(fibonachi());
            } else if (vybor4 == 8) {
                faktorial();
            } else if (vybor4 == 9) {
                treugolnik();
            } else if (vybor4 == 0) {
                System.out.println(scanner());
            }
        }
        return scanner();
    }

    static void sochinenie() {
        int age = 2021 - 1994;
        short year = 1994;
        final byte live_in_Rostov = 9;
        String lastName = "Kutekhov";
        String firstName = "Denis";
        char studiTime = 54;
        String nativeHome = "Gukovo";
        boolean my_english_very_bad = true;
        String country = "Russia";
        int currentTime = 2021;
        char smile = 9786;

        System.out.println("Helo,my name is " + firstName + " .My last name " + lastName + " .I live in " + country + " i was born in " + year + " to " + nativeHome + ". Me " + age + " year.I have two educations, management plus programming(RKSI+YufU).But i don't learned programming. " +
                "I do this now in " + currentTime + " It will take about " + studiTime + " months.P.s i live in Rostov " + live_in_Rostov + " years.Good luck to us" + smile);
    }

    static void sochinenie_O_Tebe() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where your from?");
        String from = scan.nextLine();
        System.out.println("Enter your name?");
        String name = scan.next();
        System.out.println("Enter your family?");
        String family = scan.next();
        System.out.println("input your age?");
        int age = scan.nextByte();
        System.out.printf("Outcome:\n from=%s\nage=%d\nname=%s \nfamily=%s", from, age, name, family);//souf
        System.out.println("\nOutcome:" + "\n" + age + "\n" + name + "\n" + from + "\n" + family);//  sout
        scan.close();
    }

    static void inversiya() {
        Scanner scan = new Scanner(System.in);
        System.out.println("'\nEnter your age?");
        int age2 = scan.nextInt();
        System.out.println("Enter your year");
        int year = scan.nextInt();
        System.out.println(age2 & year);
        System.out.println(age2 | year);
        System.out.println(~age2);
        System.out.println(~year);
        System.out.println(age2 ^ year);
    }

    static int chislo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int num1 = scan.nextInt();
        if ((num1 < 9) && (num1 > 5)) {
            System.out.println("Число больше 5 и меньше 10");
        } else if ((num1 > 9) || (num1 < 5)) {
            System.out.println("Неизвестное число");
        } else if (num1 == 5) {
            System.out.println("Число равно 5");
        } else {
            System.out.println("Блок else");
        }
        return num1;
    }

    static void bank() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int vklad = scan.nextInt();
        int itog = vklad + (vklad * 5 / 100);
        int itog2 = vklad + (vklad * 7 / 100);
        int itog3 = vklad + (vklad * 10 / 100);
        if (vklad < 100) {
            System.out.printf("Вклад под 5 процентов = %d\n", itog);
        } else if ((vklad >= 100) && (vklad <= 200)) {
            System.out.printf("Вклад под 7 процентов = %d\n", itog2);
        } else if (vklad > 200) {
            System.out.printf("Вклад под 10 процентов = %d\n", itog3);
        }
    }

    static int arifmetika() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название операции: 1-Сложение 2-Вычитание 3-Умножение");
        int oper = scan.nextInt();
        if (oper == 1) {
            System.out.println("Вы выбрали сложение");
        } else if (oper == 2) {
            System.out.println("Вы выбрали вычитание");
        } else if (oper == 3) {
            System.out.println("Вы выбрали Умножение");
        } else if (oper > 3) {
            System.out.println(" операция неопределена");
        }
        return oper;
    }

    static void arifmetik_Operacii() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int chislo1 = scan.nextInt();
        System.out.println("Введите число 2:");
        int chislo2 = scan.nextInt();
        System.out.println("Введите название операции: 1-Сложение 2-Вычитание 3-Умножение");
        int oper2 = scan.nextInt();
        if (oper2 == 1) {
            System.out.println(chislo1 + chislo2);
        } else if (oper2 == 2) {
            System.out.println(chislo1 - chislo2);
        } else if (oper2 == 3) {
            System.out.println(chislo1 * chislo2);
        } else if (oper2 > 3) {
            System.out.println(" операция неопределена");
        }
    }

    static void valuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        int rub = scan.nextInt();
        System.out.println("Для того что бы перевести сумму в доллары нажмите 1\nДля того что бы перевести в евро нажмите 2");
        int val = scan.nextInt();
        int dol = rub / 73;
        int eur = rub / 86;
        if (val == 1) {
            if (dol % 10 == 1) {
                System.out.printf("%d Доллар", dol);
            } else if ((dol % 10 <= 4) & (dol % 10 > 1)) {
                System.out.printf("%d Доллара", dol);
            } else if (dol % 10 > 4) {
                System.out.printf("%d Долларов", dol);
            }
        } else if (val == 2) {
            System.out.printf("%d Евро", eur);
        }
    }

    static long vremya() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Введите количество секунд:");
        long sec = scan.nextLong();
        long year = sec / 86400 / 365;
        long moduleYear = sec % (86400 * 365);
        long month = moduleYear / 86400 / 30;
        long moduleMonth = moduleYear % (86400 * 30);
        long day = moduleMonth / 86400;
        long moduleDay = moduleMonth % (day * 86400);
        long hours = moduleDay / 3600;
        long moduleHours = moduleDay % (hours * 3600);
        long min = moduleHours / 60;
        long sec1 = moduleHours % (min * 60);
        if (year % 10 == 1) {
            System.out.printf("\n%d Год", year);
        } else if ((year % 10 > 1) && (year % 10 < 5)) {
            System.out.printf("\n%d Года", year);
        } else if (year % 10 > 5) {
            System.out.printf("\n%d Лет", year);
        }
        if (month % 10 == 1) {
            System.out.printf("\n%d Месяц", month);
        } else if ((month % 10 > 1) && (month % 10 < 5)) {
            System.out.printf("\n%d Месяца", month);
        } else if (month % 10 > 5) {
            System.out.printf("\n%d Месяцев", month);
        }
        if (day % 10 == 1) {
            System.out.printf("\n%d День", day);
        } else if ((day % 10 > 1) && (day % 10 < 5)) {
            System.out.printf("\n%d Дня", day);
        } else if (day % 10 > 5) {
            System.out.printf("\n%d Дней", day);
        }
        if (hours % 10 == 1) {
            System.out.printf("\n%d Час", hours);
        } else if ((hours % 10 > 1) && (hours % 10 < 5)) {
            System.out.printf("\n%d Часа", hours);
        } else if (hours % 10 > 5) {
            System.out.printf("\n%d Часов", hours);
        }
        if (min % 10 == 1) {
            System.out.printf("\n%d Минута", min);
        } else if ((min % 10 > 1) && (min % 10 < 5)) {
            System.out.printf("\n%d Минуты", min);
        } else if (min % 10 > 5) {
            System.out.printf("\n%d Минут", min);
        }
        if (sec1 % 10 == 1) {
            System.out.printf("\n%d Секунда", sec1);
        } else if ((sec1 % 10 > 1) && (sec1 % 10 < 5)) {
            System.out.printf("\n%d Секунды", sec1);
        } else if (sec1 % 10 > 5) {
            System.out.printf("\n%d Секунд", sec1);
        }
        return sec;
    }

    static void arifmetika_Sravnenie() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int chislo1 = scan.nextInt();
        System.out.println("Введите число 2:");
        int chislo2 = scan.nextInt();
        System.out.println("Введите название операции: 1-Сложение 2-Вычитание 3-Умножение 4-сравнение");
        int oper2 = scan.nextInt();
        if (oper2 == 1) {
            System.out.println(chislo1 + chislo2);
        } else if (oper2 == 2) {
            System.out.println(chislo1 - chislo2);
        } else if (oper2 == 3) {
            System.out.println(chislo1 * chislo2);
        } else if (oper2 == 4) {
            if (chislo1 > chislo2) {
                System.out.println("Число 1 больше числа 2");
            } else if (chislo1 < chislo2) {
                System.out.println("Число 1 меньше числа 2 ");
            } else if (chislo1 == chislo2) {
                System.out.println("число 1 равно числу 2");
            }
        } else {
            System.out.println(" операция неопределена");
        }
    }

    static void naselenie() {
        for (int i = 1; i < 11; i++) {
            if (i < 10) {
                continue;
            }
            System.out.println("Численность спустя " + i + " лет равна " + (10000000 + 1000000 / 1000 * 6 * i));
        }
    }

    static void naseleniee() {
        for (int year = 1, live = 14, death = 8; year < 11; year++, live--, death--) {
            if (live < 7) live = 7;
            if (death < 6) death = 6;
            if (year < 10) {
                continue;
            }
            System.out.println("Численность спустя " + year + " лет равна " + (10000000 + 1000000 / 1000 * (live - death) * year));
        }
    }

    static void vklad() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float vklad = scan.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        float months = scan.nextFloat();
        for (int srok = 1; srok > 0; srok++) {
            if (srok > months) {
                break;
            }
            vklad += vklad * 0.07;
            System.out.println("После " + srok + " месяцев сумма вклада составит " + vklad);
        }
    }

    static void vklad_while() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float vklad = scan.nextFloat();
        System.out.println("Введите срок вклада в месяцах: ");
        float months = scan.nextFloat();
        int srok = 1;
        while (srok > 0) {
            srok++;
            if (srok > months) {
                break;
            }
            vklad += vklad * 0.07;
            System.out.println("После " + srok + " месяцев сумма вклада составит " + vklad);
        }
    }

    static void tablica_umnogeniya() {

        for (int i = 1; i < 10; i++) {
            for (int a = 1; a < 10; a++) {
                System.out.print(i * a + "\t");
            }
            System.out.println();
        }
    }

    static void umnogenie() {
        Scanner sca = new Scanner(System.in);
        int rez = 0;
        do {
            System.out.println("Введите первое число: ");
            int a = sca.nextInt();
            System.out.println("Введите второе число: ");
            int b = sca.nextInt();
            System.out.println("Результат умножения: " + a * b + " Продолжаем? 0-Да Другое число- нет");
            rez = sca.nextInt();
        }
        while (rez == 0);
    }

    static int fibonachi() {
        Scanner fib = new Scanner(System.in);
        System.out.println("Введите число: ");
        int chi = fib.nextInt();
        for (int a = 0, b = 1, chis = 0; a < b; chis = chis + 2, a += b, b += a) {
            if (chis >= chi) {
                break;
            }
            System.out.printf("%d %d ", a, b);
        }
        return chi;
    }

    static void faktorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число : ");
        int number = scan.nextInt();
        int fact = 1;
        for (int a = 1; a <= number; a++) {
            fact = fact * a;
        }
        System.out.println("Факториал " + number + "= " + fact);
    }

    static void treugolnik() {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Введите желаемую длину треугольника: ");
        int dlina = new1.nextInt();
        for (int i = 1; i <= dlina; i++) {

            for (int a = 1; a <= i; a++) {

                System.out.print("\t    " + i + "  \t  ");

            }
            System.out.print("\n");
        }
    }

    static void massive() {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 12};
        int[] numbers2 = new int[]{6, 2, 5, 4, 8, 4, 3, 2, 33};
        for (int i = 0, c = 0; c < numbers1.length; i++, c++) {
            if ((numbers1[i] > numbers2[c]) || (numbers1[i] < numbers2[c]))
                continue;

            System.out.println(numbers1[i]);
        }
    }

    static void polinodrom() {
        Scanner one = new Scanner(System.in);
        System.out.println("Введите первое число? ");
        int perv = one.nextInt();
        System.out.println("Введите второе число? ");
        int vtor = one.nextInt();
        System.out.println("Введите третье число? ");
        int tree = one.nextInt();
        System.out.println("Введите четвертое число? ");
        int fore = one.nextInt();
        int[] number = new int[]{perv, vtor, tree, fore};
        int[] number2 = new int[]{fore, tree, vtor, perv};
        for (int i = 0, b = 0; i < number.length; i++, b++) {

            if (number[i] == number2[b]) {
                System.out.println("Полинодром");
                break;
            } else {
                System.out.println("не полинодром");
                break;
            }

        }
    }

    static void massive_Plus_Massive() {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 12};
        int[] numbers2 = new int[]{6, 2, 5, 4, 8, 4, 3, 2, 33};
        int[] numbers3 = new int[numbers1.length + numbers2.length];
        int a = 0;
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
            a++;
        }
        for (int b = 0; b < numbers2.length; b++) {
            numbers3[a++] = numbers2[b];
        }
        for (int c = 0; c < numbers3.length; c++) {
            System.out.printf("\t" + numbers3[c]);
        }
    }

    static void stop_Massive() {
        int[] numbers = new int[]{1, 2, 5, 6, 7, 89, 412, 23, 35, 44, 21, 34, 56, 89, 237, 233, 4231, 12, 3434, 212, 22};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 237)
                break;
            else if ((numbers[i] % 2 > 0))
                continue;
            System.out.println(numbers[i]);
        }
    }

    static void elements() {
        int[] numbers1 = new int[]{1, 2, 3, 4, 7, 4, 9, 2, 12};// 1 7  9 12
        int[] numbers2 = new int[]{6, 2, 5, 4, 8, 4, 3, 2, 33};
        int a = 0;
        for (int i = 0, b = 8; i < numbers1.length; i++, b--) {
            if (numbers1[i] == numbers2[b])
                continue;

            System.out.println(numbers1[i]);
        }
    }

    static int chetverka() {
        int[] numbers1 = new int[]{1, 2, 3, 4, 7, 4, 3, 4, 12};
        int b = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if ((numbers1[i] - 4 > 0) || (numbers1[i] - 4 < 0)) {
                continue;
            } else if (numbers1[i] == 4) {
                b += 1;
            }
            System.out.println(b);

        }
        return b;
    }
}

