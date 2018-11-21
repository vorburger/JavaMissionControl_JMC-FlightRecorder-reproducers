/*
 * Copyright (c) 2018 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        new Main().run(Integer.parseInt(args[0]));
    }

    public void run(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            callSomething();
        }
    }

    private void callSomething() throws InterruptedException {
        try {
            callThrowing();
            Thread.sleep(10);
        } catch (IOException e) {
            // intentionally ignoring
        }

        try {
            throw new Error("Test");
        } catch (Error e) {

        }
    }

    private void callThrowing() throws IOException {
        throw new IOException("bam");
    }
}
