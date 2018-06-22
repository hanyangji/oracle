package com.oracle.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 11, 200, TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<Runnable>(5));
        ExecutorService ex=Executors.newFixedThreadPool(3);
        for(int i=0;i<16;i++){
            MyTask myTask = new MyTask(i);
            ex.execute(myTask);
            System.out.println("线程池中线程数目："+((ThreadPoolExecutor) ex).getPoolSize()+"，队列中等待执行的任务数目："+
            ((ThreadPoolExecutor) ex).getQueue().size()+"，已执行玩别的任务数目："+((ThreadPoolExecutor) ex).getCompletedTaskCount());
        }
        ex.shutdown();
	}
}	
class MyTask implements Runnable {
	    private int taskNum;
	     
	    public MyTask(int num) {
	        this.taskNum = num;
	    }
	     
	    @Override
	    public void run() {
	        System.out.println("正在执行task "+taskNum);
	        try {
	            Thread.currentThread().sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("task "+taskNum+"执行完毕");
	    }
}