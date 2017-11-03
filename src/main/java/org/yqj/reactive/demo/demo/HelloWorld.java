package org.yqj.reactive.demo.demo;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author yaoqijun on 2017-11-02.
 */
public class HelloWorld {
    public static void main(String[] args) {

//        Flowable.range(1, 10)
//                .parallel()
//                .runOn(Schedulers.computation())
//                .map(v -> v * v)
//                .sequential()
//                .blockingSubscribe(System.out::println);

//        Flowable.range(1, 10)
//                .flatMap(v ->
//                        Flowable.just(v)
//                                .subscribeOn(Schedulers.computation())
//                                .map(w -> w * w)
//                )
//                .blockingSubscribe(System.out::println);

//        Flowable.range(1, 10)
//                .observeOn(Schedulers.computation())
//                .map(v -> v * v)
//                .blockingSubscribe(System.out::println);

//        testSchedules();
    }

    private static void testSchedules() {
        Flowable.fromCallable(() -> {
            Thread.sleep(1000);
            return "Done";
        }).subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testHelloWorld(){
        Flowable.just("hello", 1, 123D).subscribe(System.out::println);
    }
}
