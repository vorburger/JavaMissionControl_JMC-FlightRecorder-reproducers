#!/bin/sh
set -ex

javac src/test/Main.java -d bin

rm -f recording.jfr
java -XX:+UnlockCommercialFeatures -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -XX:+FlightRecorder -XX:FlightRecorderOptions=defaultrecording=true,disk=true,repository=/tmp,settings=./default-with-all-exceptions.jfc,maxage=24h,dumponexit=true,dumponexitpath=recording.jfr -cp bin/ test.Main 10000
