# Java Mission Control (JMC) Flight Recorder reproducers

Running `./make.sh` produces a `recording.jfr`.


## Exceptions

Opening `recording.jfr` only contains the `Error` thrown in the `Main` class, never the `IOException`.

In `default-with-all-exceptions.jfc` the `exception-level` has been changed from the 
default `errors` (from a jdk1.8.0_92-ORACLE/jre/lib/jfr/default.jfc) to `all`. 
What is missing? 

Couldn't be a real bug... if `all` just did not work, then why would there be an option for it?! ;-)

Something must be wrong in the JFC, but it's edited with the JMC UI (Window > Flight Record Template Manager; NB must re-Export File after change!)
to enable the only option that seemed relevant to this, and don't see other options related to this (even though its format seems weird).


## References

* https://wiki.opendaylight.org/view/HowToProfilePerformance
* https://stackoverflow.com/questions/44073273/how-to-profile-thown-exception-in-java-mission-control
* https://bugzilla.redhat.com/show_bug.cgi?id=1651668
