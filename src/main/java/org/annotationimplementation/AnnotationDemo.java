package src.main.java.org.annotationimplementation;

@MyCustomAnnotation(priority=2)
public class AnnotationDemo {
    @MyCustomAnnotation
   public void showDetails() {
    System.out.println("priority");
}
}

