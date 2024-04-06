import java.util.Scanner;

public class Main {
    //    1 Problem
    public static int min_element(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
            return Math.min(arr[n - 1], min_element(n-1, arr));
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(min_element(n, arr));
    }


//    2 Problem

    public static double average(int n, int[] arr){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(average(n, arr));
    }

//    3 Problem
    public static  boolean prime(int n){
        if( n == 0 || n == 1){
            return false;
            }
        else{
            for (int i = 2; i * i <= n; i++){
            if(n  % i == 0){
                return false;
            }
        }
        return true;
    }
}

public static void  task3(){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(prime(n)){
        System.out.println("Prime");
    }
    else{
        System.out.println("Composite");
    }
    }

//    4 Problem
public static int factorial(int n){
    int fact = 1;
    for (int i = 1; i <= n; i++){
        fact = fact * i;
    }
    return fact;
}

public static void task4(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(factorial(n));
}

//5 Problem

    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        int n1 = 0, n2 = 1;
        for(int i = 2; i <= n; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    public  static void task5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

//    6 Problem

    public static int degree(int a, int n){
        if(n==0){
            return 1;
        }
        int res = a;
        for(int i = 1 ; i < n; i++){
            res *= a;
        }
        return res;
    }

    public static void task6(){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(degree(n,a));
    }

//    7 Problem

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permute(str, 0, str.length() - 1);
    }

//    8 Problem

    public static boolean AllDigits(String s){
        if(s.length() == 0){
            return true;
        }

        char num = s.charAt(0);
        if(Character.isDigit(num)){
            return  AllDigits(s.substring(1));
        }
        else{
            return false;
        }
    }

    public static void task8(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (AllDigits(s)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

//    9 Problem

    public static int binomal(int b){
        if(b <= 1){
            return 1;
        }
        return  b* binomal(b - 1);
    }


    public static void task9(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = binomal(n)/binomal(k)/binomal(n-k);
        System.out.println(res);
    }

//    10 Problem
public static int gcd(int a, int b){
    if(b == 0){
        return a;
    }
    return gcd(b, a % b);
}


public static void task10(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(gcd(a, b));
}


    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();;
        task6();
        task7();
        task8();
        task9();
        task10();
    }

}
