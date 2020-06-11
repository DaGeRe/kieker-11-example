This repository tries to run the probe-aspectj example on OpenJDK 11.

# Setting Final Values

To try running with final values, run `./run.sh` and then in the container

```Bash 
cd ../aspectj-maven
mvn clean package
java -cp classes/ -javaagent:../kieker-1.14-SNAPSHOT-aspectj.jar de.kiekertest2.Main
```

This will result in an error like

```
Exception in thread "main" java.lang.IllegalAccessError: Update to non-static final field de.kiekertest2.FinalFieldConstructorExample.parameters attempted from a different method (init$_aroundBody0) than the initializer method <init> 
	at de.kiekertest2.FinalFieldConstructorExample.init$_aroundBody0(FinalFieldConstructorExample.java:14)
	at de.kiekertest2.FinalFieldConstructorExample$AjcClosure1.run(FinalFieldConstructorExample.java:1)
	at org.aspectj.runtime.reflect.JoinPointImpl.proceed(JoinPointImpl.java:167)
	at kieker.monitoring.probe.aspectj.operationExecution.AbstractOperationExecutionAspect.operation(AbstractOperationExecutionAspect.java:59)
	at de.kiekertest2.FinalFieldConstructorExample.<init>(FinalFieldConstructorExample.java:13)
	at de.kiekertest2.Main.main_aroundBody2(Main.java:7)
	at de.kiekertest2.Main$AjcClosure3.run(Main.java:1)
	at org.aspectj.runtime.reflect.JoinPointImpl.proceed(JoinPointImpl.java:167)
	at kieker.monitoring.probe.aspectj.operationExecution.AbstractOperationExecutionAspect.operation(AbstractOperationExecutionAspect.java:59)
	at de.kiekertest2.Main.main(Main.java:6)
```

# Basic Kieker Example

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

