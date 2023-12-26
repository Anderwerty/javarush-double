package ua.javarush.module3.lesson18;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
//        SoftReference<Object> objectSoftReference = new SoftReference<>(obj);
//        Object o = objectSoftReference.get();
////        objectSoftReference.clear();
////        obj = null;
//        System.out.println(obj ==o);
        WeakReference<Object> weakReference = new WeakReference<>(obj);
        System.gc();
        System.gc();
        System.gc();
        Thread.sleep(10000);
        Object o1 = weakReference.get();
        obj =null;
        System.out.println(o1==obj);



    }
}
