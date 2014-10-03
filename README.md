# Playing With Fuse - JMS version

## On Deploy
    When this file is dropped into a Fuse container, any 
    xml files in OSGI-INF/blueprint will be automatically 
    registered.

    This particular example pushes messages onto a JMS queue based
    on a timer event.  A seperate route is defined to listen to the
    queue and write the messages to the filesystem.

## Installation
    mvn package
    fire up Fuse
        > bin/fuse
        > osgi:install -s file:/vagrant/play2-1.0-SNAPSHOT.jar
   

