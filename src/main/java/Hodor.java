public class Hodor {
    public static void main(String[] args) throws Exception {
        int hodorStrength = 50;
        int[] doorsStrength = {100, 25, 53};
        int[] zombiesInflux = {2, 3, 11};

        System.out.println("The Strongest Door is the: " + holdTheDoor(hodorStrength, doorsStrength, zombiesInflux) + "°");
    }

    private static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) throws Exception {
        int[] timeTillCrush = new int[doorsStrength.length];
        int index = 0;
        if (doorsStrength.length != zombiesInflux.length) {
            throw new Exception("Array's length doesn't match!");
        }

        for (int i = 0; i < doorsStrength.length; i++) {

            int totalStrength = hodorStrength + doorsStrength[i];
            int timeInSeconds = totalStrength / zombiesInflux[i];

            timeTillCrush[index] = timeInSeconds;
            index++;
        }

        return getMaxTimeTillCrush(timeTillCrush);
    }

    private static int getMaxTimeTillCrush(int[] timeTillCrush) {
        int strongestDoorIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < timeTillCrush.length; i++) {
            if (timeTillCrush[i] > maxValue) {
                maxValue = timeTillCrush[i];
                strongestDoorIndex = i;
            }
        }
        return strongestDoorIndex;
    }
}
