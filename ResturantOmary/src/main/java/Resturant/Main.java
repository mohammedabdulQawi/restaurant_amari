package Resturant;

import java.util.Scanner;

class Main{
    public static void new_foods(){
        Scanner input=new Scanner(System.in);
        Item []fod =new Food[1];

        for (int i=0;i< fod.length;i++){
            System.out.println("Enter Item name");
            System.out.println("Enter Item Price");
            System.out.println("Enter Item Cost");
            System.out.println("Enter Item type");
            Item newFoods=new Food(input.next(),input.nextDouble(),input.nextDouble(),input.next());
            fod[i]=newFoods;
        }

    }
    public static void new_drinks(){
        Scanner input=new Scanner(System.in);
        Item [] drnk=new Drink[10];

        for (int i=0;i< drnk.length;i++){
            System.out.println("Enter Item name");
            System.out.println("Enter Item Price");
            System.out.println("Enter Item Cost");
            System.out.println("Enter Item Drinks Type");
            Item newDrinks=new Drink(input.next(),input.nextDouble(),input.nextDouble(),input.next());
            drnk[i]=newDrinks;
        }

    }


    public static void food(int choose){
        Scanner input = new Scanner(System.in);
        int check= 1;

        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1-Food\n2-Exit");
            System.out.println("--------------------------------------------------------------");
            System.out.print("please choose a number:");
            choose = input.nextInt();
            switch (choose) {
                case 1 -> {
                    int options;
                    do {
                        System.out.println("--------------------------------------------------------------");
                        System.out.print("""
                                                                 1-traditional food
                                                                 2-Sea food
                                                                 3-Meats
                                                                 4-Return
                                                                 """);
                        System.out.print("--------------------------------------------------------------\n");
                        System.out.print("please choose a number:");
                        options = input.nextInt();
                        switch (options) {
                            case 1 -> {
                                int chose;
                                do {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.print("""
                                                                                         1-salta
                                                                                         2-fasah
                                                                                         3-rice
                                                                                         4-Return
                                                                                         """);
                                    System.out.print("--------------------------------------------------------------\n");
                                    System.out.print("please choose a number:");
                                    chose = input.nextInt();
                                    switch (chose) {
                                        case 1 -> System.out.print("cost=2000\n");
                                        case 2 -> System.out.print("cost=2500\n");
                                        case 3 -> System.out.print("cost=500\n");
                                        case 4 -> System.out.println("Have a great mael");
                                        default -> System.out.println("please enter a valid number");
                                    }
                                } while (chose != 4);
                            }
                            case 2 -> {
                                int opt;
                                do {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.print("1-Tuna\n2-shrimp\n3-salomn\n4-Return\n");
                                    System.out.print("--------------------------------------------------------------\n");
                                    System.out.print("please choose a number:");
                                    opt = input.nextInt();
                                    switch (opt) {
                                        case 1 -> System.out.print(" cost=3000\n");
                                        case 2 -> System.out.print("cost=4000\n");
                                        case 3 -> System.out.print("cost=5000\n");
                                        case 4 -> System.out.println("Have a great mael");
                                        default -> System.out.println("please enter a valid number");

                                    }
                                } while (opt != 4);
                            }
                            case 3 -> {
                                int pop;
                                do {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.print("1-Beef\n2-Grilled chicken\n3-Chicken breast\n4-Return\n");
                                    System.out.print("--------------------------------------------------------------\n");
                                    pop = input.nextInt();
                                    switch (pop) {
                                        case 1:
                                            System.out.print("cost=4500\n");
                                            break;
                                        case 2:
                                            System.out.print("cost=2200\n");
                                            break;
                                        case 3:
                                            System.out.print("cost=700\n");
                                        case 4:
                                            System.out.println("Have a great mael");
                                            break;
                                        default:
                                            System.out.println("please enter a valid number");
                                    }

                                } while (pop != 4);
                            }

                        }

                    } while (options != 4);
                }
                case 2 -> {
                    System.out.println("--------------------------------------------------------------");
                    System.out.print("Do you want to continue?\n");
                    System.out.print("Please enter 1 to continue or 0 to exit:");
                    check= input.nextInt();
                    System.out.println("--------------------------------------------------------------");
                    if (check== 0)
                        System.exit(0);
                }
                default -> System.out.println("Thanks for visiting");

            }

        } while (check!= 0);
    }

    public static void drinks(int choose){
        Scanner input = new Scanner(System.in);
        int check= 1;
        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1-Drinks\n2-Exit");
            System.out.print("--------------------------------------------------------------\n");
            System.out.print("please choose a number:");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    int MMA;
                    do {
                        System.out.println("--------------------------------------------------------------");
                        System.out.print("1-soft drinks\n2-Natural drinks\n3-Hot drinks\n");
                        System.out.print("--------------------------------------------------------------\n");
                        System.out.print("please choose a number:");
                        MMA = input.nextInt();
                        switch (MMA) {
                            case 1:
                                int mma2;
                                do {
                                    System.out.print("--------------------------------------------------------------");
                                    System.out.print("1-coca cola\n 2-fanta\n3-miranda\n4-Return");
                                    System.out.print("--------------------------------------------------------------\n");
                                    System.out.print("please choose a number:");
                                    mma2 = input.nextInt();
                                    switch (mma2) {
                                        case 1 -> System.out.print("cost=250\n");
                                        case 2 -> System.out.print("cost=350\n");
                                        case 3 -> System.out.print("cost=300\n");
                                        case 4 -> System.out.println("Have a great mael");
                                        default -> System.out.println("choose a valid number");

                                    }
                                } while (mma2 != 4);
                                break;
                            case 2:
                                int mma3;
                                do {
                                    System.out.print("--------------------------------------------------------------");
                                    System.out.print("1-limon\n2-mango\n3-orange4-Return");
                                    System.out.print("--------------------------------------------------------------\n");
                                    System.out.print("please choose a number:");
                                    mma3 = input.nextInt();
                                    switch (mma3) {
                                        case 1 -> System.out.print("cost =150\n");
                                        case 2 -> System.out.print("cost=450\n");
                                        case 3 -> System.out.print("cost =350\n");
                                        case 4 -> System.out.println("Have a great mael");
                                        default -> System.out.println("please enter a vaild number");
                                    }
                                } while (mma3 != 4);
                                break;
                            case 3:
                                int MMA4;
                                do {
                                    System.out.print("--------------------------------------------------------------");
                                    System.out.print("1-Tea\n2-Cappuccino\n3-Espereso\n4-Hot chocolate5-Return");
                                    System.out.print("--------------------------------------------------------------\n");
                                    System.out.print("please choose a number:");
                                    MMA4 = input.nextInt();
                                    switch (MMA4) {
                                        case 1:
                                            System.out.println("cost=150\n");
                                            break;
                                        case 2:
                                            System.out.print("cost=800\n");
                                            break;
                                        case 3:
                                            System.out.print("cost=600\n");
                                            break;
                                        case 4:
                                            System.out.print("cost=800\n");
                                        case 5:
                                            System.out.println("Have a great mael");
                                            break;
                                        default:
                                            System.out.println("enter a vaild number ");

                                    }
                                } while (MMA4 != 5);
                            case 4:
                                System.out.print("Have a great mael");
                                break;
                            default:
                                System.out.print("You enter a valid number");
                        }
                    } while (MMA != 4);
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------------");
                    System.out.print("Do you want to continue?\n");
                    System.out.print("Please enter 1 to continue or 0 to exit:");
                    check= input.nextInt();
                    System.out.println("--------------------------------------------------------------");
                    if (check== 0)
                        System.exit(0);
                default:
                    System.out.println("You enter a valid number");

            }

        } while (check!= 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("--------------------------------------------------------------");
        System.out.println("Welcome To MSA Resurant ");
        System.out.println("1-Food \n2-Drinks\n3-Insert new Food\n4-Insert new Drinks\n5-Display new items");
        System.out.println("--------------------------------------------------------------");
        System.out.print("please choose a number:");
        choose = input.nextInt();
        if (choose==1) {
            food(choose);
        }

        if (choose==2){
            drinks(choose);
        }
        if (choose==3){
            new_foods();
        }
        if (choose==4){
            new_drinks();
        } 


        }

    }



