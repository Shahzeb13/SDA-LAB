
package lab;


public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        
        subject.detach(binaryObserver);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

