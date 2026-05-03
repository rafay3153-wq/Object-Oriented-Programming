class Simple {
    protected int num1;
    protected int num2;

    void setValues(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    Simple() {
    }

    Simple(int n1, int n2) {
        n1 = num1;
        n2 = num2;
    }

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    void mul() {
        System.out.println("Multiplicaion: " + (num1 * num2));
    }

    void div() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Error:Division by 0!");
        }
    }
}

class VerifiedSimple extends Simple {
    void add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error:Values must be greater than 0 for addition.");
        }
    }

    void sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error:Values must be greater than 0 for subtraction.");
        }
    }

    void mul() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error:Values must be greater than 0 for multiplication.");
        }
    }

    void div() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error:Values must be greater than 0 for division.");
        }
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        VerifiedSimple obj = new VerifiedSimple();
        obj.setValues(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
