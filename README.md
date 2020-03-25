This repository tries to run the probe-aspectj example on OpenJDK 11.

Start the container by running `./run.sh` and afterwards:

Try `./gradlew runMonitoring` - this will result in an unparsable Java version error, since the wrapper is outdated.

Try `gradle runMonitoring` - this will result in an error like:

Error: Unable to initialize main class kieker.examples.monitoring.aspectj.BookstoreStarter
Caused by: java.lang.VerifyError: Expecting a stackmap frame at branch target 60
Exception Details:                                                        
  Location:                                                                          
    kieker/examples/monitoring/aspectj/BookstoreStarter.main_aroundBody0([Ljava/lang/String;Lorg/aspectj/lang/JoinPoint;)V @32: if_icmpge
  Reason:                                                                 
    Expected stackmap frame at this location.                             
  Bytecode:

