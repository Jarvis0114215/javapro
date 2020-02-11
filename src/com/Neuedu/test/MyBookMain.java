package com.Neuedu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create by Jia on 2020/2/10/010 18:18
 */

/*程序1 定义一个类MyBook，包括成员name（书名String）、price（价格 double）、
press（出版社String）、author（作者 String）、bookISBN（书的ISBN号String），
定义一个类数组mybook books[200]，编写一个函数inputData(ArrayList<Mybook> books])，
n为书的数量，从键盘上输入n本书的信息，编写一个函数print(ArrayList<Mybook> books)，
输出全部书的信息。

程序2 在程序1的基础上，增加查找功能，
编写函数searchName(ArrayList<Mybook> books,String name)，
根据书名name在数组books中查找是否存在此书，
如果能找到，输出该书的详细信息，如果找不到，输出“此书不存在”。

程序3 增加删除功能，编写函数deleteName(ArrayList<Mybook> books,String name)，
根据书名name在数组books中查找是否存在此书，如果存在，删除该书，并提示“此书删除成功。 ”，
并显示该书的详细信息。如果不存在，输出“没有此书，删除失败.”

程序4 添加函数menu()，
输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
1：添加图书2：删除图书3：查找图书（根据用户名）
4：退出当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。 */


public class MyBookMain {
    public static MyBook[] books = new MyBook[200];//数组，好像没啥用
    public static List<MyBook> list = new ArrayList<>();
    public static void main(String[] args) {
        inputData(list);
        menu();
    }

    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                add(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名:");
                String name = scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查找的书名:");
                String searchname = scanner.next();
                deleteName(list,searchname);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;
        }
    }

    //初始化，放一些书的数据
    public static void inputData(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书的数量n:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"bookISBN"+i);
            books.add(myBook);
        }
    }
    //添加
    public static void add(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入书名");
        String name = scanner.next();
        System.out.println("输入价格");
        Double price = scanner.nextDouble();
        System.out.println("输入出版社");
        String press = scanner.next();
        System.out.println("输入作者");
        String author = scanner.next();
        System.out.println("输入书号");
        String bookISBN = scanner.next();
        //list.add(new MyBook(name, price, press, author, bookISBN);
        MyBook myBook = new MyBook(name, price, press, author, bookISBN);
        books.add(myBook);
        System.out.println("添加成功");
        menu();
    }
    //输出所有的书
    public static void print(List<MyBook> books){
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));//get到的是myBook  引用类型 默认调用toString() 利用get(int index)方法获得指定索引位置的对象
        }
        menu();
    }
    //查找
    public static void searchName(List<MyBook> books,String name){
        for (int i = 0; i < books.size(); i++) {
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                System.out.println(myBook);
                menu();
                return;
            }
        }
        System.out.println("没有此书，删除失败.");
        menu();
    }

    public static void deleteName(List<MyBook> books,String name){
        for (int i = 0; i < books.size(); i++) {
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("此书删除成功。");
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
}
