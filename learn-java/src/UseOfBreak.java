public class UseOfBreak {
    public static void main(String[]args){
//        use break will exit the loop the break is in
//        use break in while loop:
//        while (true){
//            System.out.println("Hi!");
//            break;
//        }
//        int i = 0;
//        while (i < 3) {
//            System.out.println("Hi");
//            i++;
//            // break
//        }

//        use break in for loop:
//        int[]numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] == 30){
//                break;
//            }
//            System.out.println(numbers[i]);
//        }

//        use break in switch:
//        int i = 2;
//        switch (i){
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            default:
//                System.out.println("default number");
//                break;
//        }

        // distinguish break with nested loop:
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j ++){
                System.out.println(i + " + " + j);
                // break
            }
        }


    }
}
