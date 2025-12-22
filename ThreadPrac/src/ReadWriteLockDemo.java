import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        ReadWriteLock rwLock = new ReentrantReadWriteLock();

        Lock readLock = rwLock.readLock();
        Lock writeLock = rwLock.writeLock();

        int value = 0;

// Reader
        readLock.lock();
        try {
            System.out.println(value);
        } finally {
            readLock.unlock();
        }

// Writer
        writeLock.lock();
        try {
            value++;
        } finally {
            writeLock.unlock();
        }

    }
}
