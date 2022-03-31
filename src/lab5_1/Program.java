package src.lab5_1;

import src.lab5_1.Fraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите k:");

        Scanner console = new Scanner(System.in);

        try {
            int k = console.nextInt();

            Fraction[] fractions = new Fraction[k];

            for (int i = 0; i < k; i++) {
                System.out.println("Введите m для дроби " + (i + 1) + ":");
                int m = console.nextInt();
                System.out.println("Введите n для дроби " + (i + 1) + ":");
                int n = console.nextInt();

                fractions[i] = new Fraction(m, n);
            }

            PrintArray(fractions);

            for (int i = 0; i < k - 1; i += 2) {
                fractions[i] = fractions[i].Add(fractions[i + 1]);
            }

            PrintArray(fractions);

        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода");
        } catch (NegativeArraySizeException e) {
            System.out.println("Размерность массива должна быть положительная");
        } catch (OutOfMemoryError e) {
            System.out.println("Недостаточно памяти");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            console.close();
        }

    }


    private static void PrintArray(Fraction[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.print("]\n");
    }
}
