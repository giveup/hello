package net.kimleo.hello.message;

import net.kimleo.hello.annotation.Component;

import java.io.PrintStream;

@Component
public interface MessageResolver {
    void resolve(String message, PrintStream stream);
}
