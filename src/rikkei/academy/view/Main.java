package rikkei.academy.view;


import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Shop MDPhone");
        System.out.println("| 1: Show list Product   |");
        System.out.println("| 2: CreatProduct        |");
        System.out.println("| 3: SortProduct         |");
        System.out.println("| 0: Exit                |");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 1:
                new ProductView().viewProduct();
                break;
            case 2:
                System.out.println("Enter Creat Product : ");
                break;
            case  3:
                new ProductView().sortProduct();
                break;
            case 0:
                System.out.println("Thank you and see you later");
                break;
        }

    }

    public static void main(String[] args) {
        new Main();

    }

}