package org.yqj.reactive.demo.github;

import io.reactivex.Observable;

/**
 * @author yaoqijun on 2017-11-03.
 */
public class Demo1 {
    public static void main(String[] args) {

        simpleJustMap();
//        simpleJust();
    }

    private static void simpleJustMap(){
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .map(String::length)
                .subscribe(System.out::println);
    }

    private static void simpleJust(){
        Observable myStrings = Observable.just("yao","qi","jun");
        myStrings.subscribe(System.out::println);
    }
}
