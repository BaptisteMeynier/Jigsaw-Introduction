module com.java.jigsaw.student.service.dbimpl {
    requires transitive com.java.jigsaw.student.service;
    requires java.logging;
    exports com.java.jigsaw.student.service.dbimpl;
}