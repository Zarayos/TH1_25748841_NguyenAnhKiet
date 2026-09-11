
package Tuan_1;

import java.util.Scanner;

public class HelloName {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        HelloName s1 = new HelloName();

        Scanner n1 = new Scanner(System.in);

        System.out.println("Nhap vao ten cua ban:");
        String name = n1.nextLine();

        s1.setName(name);

        System.out.println("Hello " + s1.getName());

        n1.close();
    }
}
