# Java Mission Control (JMC) Flight Recorder reproducers

Running `./make.sh` produces a `recording.jfr`.

This uses a custom `default-with-all-exceptions.jfc`; those can be created by importing 
an e.g. `jdk1.8.0_92-ORACLE/jre/lib/jfr/default.jfc` into the JMC UI (Window > Flight Record Template Manager),
then edited.  NB must re-Export File after change.


## Exceptions

Opening `recording.jfr` only contains the `Error` thrown in the `Main` class, never the `IOException`.

In the custom JFC used, the `exception-level` has been changed from the  default `errors` to `all`.

_**This custom JFC actually works in a "real" app; there just appears to be some .. optimization (?)
which make it not work in a trivialized short lived test example like this.**_


## References

* https://wiki.opendaylight.org/view/HowToProfilePerformance
* https://stackoverflow.com/questions/44073273/how-to-profile-thown-exception-in-java-mission-control
* https://bugzilla.redhat.com/show_bug.cgi?id=1651668
