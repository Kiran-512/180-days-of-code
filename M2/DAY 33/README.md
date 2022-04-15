Sleep is static method of Thread class where as join is an instance method of Thread class which throws InteruptedException at Compilation time (Checked Exception):
EVEN IF WE WRTIE 
t1.sleep(); => t1 will be replaced by its Type if its Thread then it will become Thread.sleep(); =>If 
its diff then it will become Type.sleep(); but type or its parent must have sleep(); method:

=============================
Reflection:

We can fetch the metadata of class, we can create the Object of the class Class and store in it the object of the class:

=============================
Synchronized keyWord
Synchronization in Java is the capability to control the access of multiple threads to any shared resource. Java Synchronization is better option where we want to allow only one thread to access the shared resource.

=> instance syncrhonized method
- lock will be aquired by the object of the class that we create the explicitly,

=> static syncrhonized method:
- here lock will be aquired by the object of class Class which is created to store the meta data of the class in which static method presents

=============================

What is the difference between user threads and daemon threads?
The main difference between Daemon thread and user threads is that the JVM does not wait for Daemon 
thread before exiting while it waits for user threads, it does not exit until unless all the user 
threads finish their execution.

Java offers two types of threads: user threads and daemon threads. User threads are high-priority threads. 
The JVM will wait for any user thread to complete its task before terminating it. On the other  hand, daemon 
threads are low-priority threads whose only role is to provide services to user threads.


Daemon Thread in Java
It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
Its life depends on user threads.
It is a low priority thread.

Why JVM terminates the daemon thread if there is no user thread?
The sole purpose of the daemon thread is that it provides services to user thread for background supporting task. 
If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread 
if there is no user thread.
=============================