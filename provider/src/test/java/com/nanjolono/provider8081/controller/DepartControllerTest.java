package com.nanjolono.provider8081.controller;

import org.junit.Before;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(2)
@Warmup(iterations = 2)
@Measurement(iterations = 1)
public class DepartControllerTest {

    @Benchmark
    public void benchMarkArrayList(){

    }
}