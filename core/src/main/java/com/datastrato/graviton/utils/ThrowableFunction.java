/*
 * Copyright 2023 Datastrato.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.graviton.utils;

@FunctionalInterface
public interface ThrowableFunction<T, R> {

  R apply(T t) throws Exception;
}