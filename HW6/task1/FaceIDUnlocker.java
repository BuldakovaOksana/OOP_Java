package HW6.task1;

public class FaceIDUnlocker implements Unlocker {
    private String faceID;

    public FaceIDUnlocker(String faceID) {
        this.faceID = faceID;
    }

    @Override
    public void unlock() {
        System.out.println(faceID);
    }

}
