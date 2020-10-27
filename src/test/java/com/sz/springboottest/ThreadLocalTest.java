package com.sz.springboottest;

/**
 * 描述类的作用
 *
 * @author abel
 * @date 2020/10/17 7:42
 */
public class ThreadLocalTest {

  public static void main(String[] args) {
    ThreadLocal local1 = new ThreadLocal();
    ThreadLocal local2  = new ThreadLocal();
    local1.set(333);
    local2.set("0000");

    System.out.println(local1.get());
    System.out.println(local2.get());
  }
}
