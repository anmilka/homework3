public class NumberSolution {

    // Вывести число в обратном порядке
    void reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int a = number % 10;
            reverse = reverse * 10 + a;
            number /= 10;
        }
        System.out.println("Число в обратном порядке: " + reverse);
    }

    //Вывести макс и мин цифры
    void maxAndMin(int number) {
        int min = 99;
        int max = 0;
        while (number != 0) {
            int b = number % 10;
            if (b > max) {
                max = b;
            }
            if (b < min) {
                min = b;
            }

            number = (number - b) / 10;
        }
        System.out.println("Минимальная цифра: " + min);
        System.out.println("Максимальная цифра: " + max);
    }

    //Вывести true если в числе нет цифр дубликатов
    void dupllicate(int number) {
        boolean bool = true;

        while (number > 0 && bool) {
            int c = number % 10;
            number = (number - c) / 10;

            int temp = number;
            while (temp > 0) {
                int d = temp % 10;
                temp = (temp - d) / 10;

                if (c == d) {
                    bool = false;
                    break;
                }
            }
        }
        System.out.println(bool);
    }

    //1.Вывести макс и мин
    void maxAndMinArr(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }

    //2.Вывести чет и не чет числа
    void evenOdd(int arr[]) {
        for (int number : arr) {
            if (number % 2 == 0) {
                System.out.println("Чётное число: " + number);
            }
        }
        for (int number : arr) {
            if (number % 2 != 0) {
                System.out.println("Нечётное число: " + number);
            }
        }

    }

    //3.Самое короткое и самое длинное
    void shortAndLong(int arr[]) {
        int longestNumber = arr[0];
        int shortestNumber = arr[0];

        int longestDigits = 0;
        int shortestDigits = Integer.MAX_VALUE;

        for (int number : arr) {
            int absNumber = Math.abs(number);
            int digitCount = 0;
            int a = absNumber;

            while (a != 0) {
                a /= 10;
                digitCount++;
            }

            if (digitCount > longestDigits) {
                longestDigits = digitCount;
                longestNumber = number;
            }
            if (digitCount < shortestDigits) {
                shortestDigits = digitCount;
                shortestNumber = number;
            }
        }
        System.out.println("Самое длинное число: " + longestNumber);
        System.out.println("Самое короткое число: " + shortestNumber);
    }

    //5.Палиндром
    void palindrom(int arr[]) {
        for (int i : arr) {
            int original = i;
            int rev = 0;
            while (i != 0) {
                int digit = i % 10;
                rev = rev * 10 + digit;
                i /= 10;
            }
            if (original == rev) {
                System.out.println(original + " является палиндромом.");
            }
        }

    }
}
