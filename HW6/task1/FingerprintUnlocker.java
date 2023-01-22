package HW6.task1;

public class FingerprintUnlocker implements Unlocker {
    private String fingerprint;

    public FingerprintUnlocker(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println(fingerprint);

    }

}
