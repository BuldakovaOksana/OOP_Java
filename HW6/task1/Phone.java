/*
 * Пользователь выбирает способ разблокировки телефона: без пароля; пин; отпечаток пальца; лицо.

class Unlocker {
	private int mode;  // режим
	private int pin;  // на случай пин-кода
	private String fingerprint;  // на случай отпечатка пальца
	private String faceID;  // на случай лица
}

Найдите решение, которое отвечает SRP и OCP

 */

package HW6.task1;

public class Phone {
    public static void main(String[] args) {
        FaceIDUnlocker faceIDUnlocker = new FaceIDUnlocker("Распознавание по лицу");
        FingerprintUnlocker fingerprintUnlocker = new FingerprintUnlocker("Отпечаток пальца");
        ModeUnlocker modeUnlocker = new ModeUnlocker(000);
        PinUnlocker pinUnlocker = new PinUnlocker(4546);

        faceIDUnlocker.unlock();
        fingerprintUnlocker.unlock();
        modeUnlocker.unlock();
        pinUnlocker.unlock();
    }
}
