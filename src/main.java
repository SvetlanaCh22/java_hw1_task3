// Encoding cp1251 because my Windows console show ??? for russian chars

// ����������� ������� �����������

// �������� ��������

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = GetInt(1); // ����� 1
        int num2 = GetInt(2); // ����� 2
        char operation = GetOperation(); // �������� ����������
        int result = Calc(num1, num2, operation);
        System.out.println("��������� ����������: " + result);
    }

    public static int GetInt(int n){
        System.out.print("������� ����� " + Integer.toString(n) + ": ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("������ �����. ���������� ��� ���.");
            scanner.next(); // ��������
            num = GetInt(n);
        }
        return num;
    }

    public static char GetOperation(){
        System.out.print("������� ��������: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("������ �����. ���������� ��� ���.");
            scanner.next(); // ��������
            operation = GetOperation();
        }
        return operation;
    }

    public static int Calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("�������� �� ����������. ��������� ����.");
                result = Calc(num1, num2, GetOperation()); // ��������
        }
        return result;
    }
}
