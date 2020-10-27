package com.sz.springboottest.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Overtime {

  private int i = 0;
  private boolean stop = true;


//  @Scheduled(cron = "*/5 * * * * *")
  public void timer() {
    System.out.println("start--->"+new Date());
    System.out.println(++i);
    try {
      if (stop) {
        Thread.sleep(6000);
        stop = false;
      }else {
        stop = true;
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("end--->"+new Date());
  }
}
