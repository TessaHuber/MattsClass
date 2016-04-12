package lab2_2;

public class modlab2task3b {
	public static void main(String [] args){

	for (int i = 0; i < 5; i+=2) {
        if (i == 0) {
            for (int b = 0; b < (5 / 2) + 1; b++)
                System.out.print(' ');
            System.out.print('*');
        } else {
            for (int n = 0; n < 5 - i; n+=2) {
                System.out.print(' ');
            } System.out.print('*');
            for (int s = 0; s < i-1; s++) {
                System.out.print(' ');
            } System.out.print('*');
        }
        System.out.print('\n');
    }
 
    for (int i = 0; i < 3; i +=2 ) {
        if (i == 2) {
            for (int a = 0; a < (5 / 2) + 1; a++)
                System.out.print(' ');
            System.out.print('*');
        } else {
            for (int a = 0; a <= i + 2; a += 2) {
                System.out.print(' ');
            } System.out.print('*');
            for (int a = 0; a < (3 / 2) - i; a++) {
                System.out.print(' ');
            } System.out.print('*');
        }
        System.out.print('\n');
    }
}}


