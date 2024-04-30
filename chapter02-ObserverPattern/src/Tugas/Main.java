package Tugas;

class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        // Register observers to the subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Subject changes its message
        subject.setMessage("Hello Observers!");

        // Unregister observer1
        subject.removeObserver(observer1);

        // Subject changes its message again
        subject.setMessage("Another message!");
    }
}

