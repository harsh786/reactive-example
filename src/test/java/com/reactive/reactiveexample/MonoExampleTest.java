package com.reactive.reactiveexample;

import org.junit.Test;
import reactor.core.publisher.Mono;

import java.util.Optional;

public class MonoExampleTest {

    @Test
    public void test1(){

        Mono<Optional<String>> optMono= Mono.just(Optional.ofNullable("harsh"));
        Mono.error();
        Mono.justOrEmpty();

        optMono.log();
        optMono.flatMap();
        optMono.map();
        optMono.flatMapMany();
        optMono.flatMapIterable();
        optMono.mapNotNull();

        optMono.filter();
        optMono.filterWhen();



        optMono.onErrorComplete();
        optMono.onErrorContinue();
        optMono.onErrorMap();
        optMono.onErrorResume();
        optMono.onErrorStop();
        optMono.onErrorReturn();

        optMono.doOnSuccess();
        optMono.doOnEach();
        optMono.doOnError();
        optMono.doOnNext();
        optMono.doOnRequest();
        optMono.doOnCancel();
        optMono.doOnSubscribe();
        optMono.doOnSuccess();
        optMono.doOnTerminate();
        optMono.doFinally();

        optMono.or();
        optMono.thenMany();
        optMono.then();
        optMono.defaultIfEmpty()
        optMono.thenEmpty();
        optMono.thenReturn();
        optMono.switchIfEmpty();
        optMono.as();

        optMono.hasElement();
        optMono.publishOn();
        optMono.publish();
        optMono.take();
        optMono.timeout();
        optMono.subscribe();


        optMono.repeatWhenEmpty();
        optMono.retryWhen();

        optMono.elapsed();


        optMono.hide();
        optMono.flux();


    }
}
