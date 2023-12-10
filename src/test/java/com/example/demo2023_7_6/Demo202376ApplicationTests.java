package com.example.demo2023_7_6;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo2023_7_6.domain.entity.Student;
import com.example.demo2023_7_6.domain.testEnum.SEXENUM;
import com.example.demo2023_7_6.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.Unsafe;

import javax.annotation.Resource;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootTest
@Slf4j
class Demo202376ApplicationTests {
    @Resource
    public IStudentService studentService;


    @Test
    void threadLocalTest1() {
        ThreadLocal tl = new ThreadLocal();
        tl.set("123");
        tl.set("223");
        System.out.println(tl.get());
        System.out.println(tl.get());

    }


    @Test
    void threadTest() {
        LongAdder longAdder = new LongAdder();
        ReentrantLock lock = new ReentrantLock();
        lock.tryLock();
//        lock.unlock();
        System.out.println(lock.isLocked());
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                6,
                1000,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(64),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "当前线程运行中-1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被打断了");
            }
        });
        threadPoolExecutor.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "当前线程运行中-1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被打断了");
            }
        });
        threadPoolExecutor.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "当前线程运行中-1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被打断了");
            }
        });
        threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "当前线程运行中-2"));
        threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "当前线程运行中-2"));
        threadPoolExecutor.shutdown();
        try {
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "当前线程运行中-2"));
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "当前线程运行中-2"));
        } catch (RejectedExecutionException e) {
            System.out.println("线程池已关闭");
        }
//        final List<Runnable> runnables = threadPoolExecutor.shutdownNow();
//        System.out.println(runnables.size());
    }


    @Test
    void contextLoads() {
        System.out.println(studentService.getBaseMapper());
        System.out.println(SEXENUM.BOY);
        System.out.println(SEXENUM.GIRL);
        System.out.println(SEXENUM.OTHER);
        System.out.println(SEXENUM.BOY);
        log.info("info");
        log.error("error");
        log.warn("warn");
    }

    @Test
    void testSql() {

        System.out.println("ABCDEFG".hashCode());
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Unsafe unsafe = (Unsafe) theUnsafe.get(null);
            long l = unsafe.objectFieldOffset(Demo202376ApplicationTests.class.getDeclaredField("studentService"));
            System.out.println(unsafe);
            System.out.println(l);
            System.out.println(studentService);
            System.out.println(unsafe.getObject(this, l));
            System.out.println(unsafe.addressSize());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(studentService
                .getOne(Wrappers.lambdaQuery(Student.class)
                        .eq(Student::getId, 1)
                        .select(Student::getId)));

    }


}
