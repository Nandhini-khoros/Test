package com.company;
import java.util.Scanner;
class Test
{
    static int add(int j, int k)
    {
        int c;
        c=j+k;
        return c;
    }
    int sub(int j,int k)
    {
        int c;
        c=j-k;
        return c;
    }

    int mul(int j,int k)
    {
        int c;
        c=j*k;
        return c;
    }
    int div(int j,int k)
    {
        int c;
        c=j%k;
        return c;
    }
    public static void main(String[] args) {
        Test t=new Test();
        Scanner s=new Scanner(System.in);
        int d,e,f,g;
        int a,b;
        System.out.println("Enter a,b");
        a=s.nextInt();
        b=s.nextInt();
        d=t.add(a,b);
        e=t.sub(a,b);
        f=t.mul(a,b);
        g=t.div(a,b);
        System.out.println("Sum is "+d);
        System.out.println("diff is "+e);
        System.out.println("product is "+f);
        System.out.println("div is "+g);

    }
}
