import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RareNotes {
    public static void main(String[] args) {
        int[] notes = generateRandomValues();
        int[] rareNotes = getRareNotes(notes);
        for (int rareNote : rareNotes) {
            System.out.println("RareNote: " + rareNote);
        }

    }

    private static int[] generateRandomValues() {
        Random random = new Random();
        return random.ints(10, 1, 10).toArray();
    }

    private static int[] getRareNotes(int[] notes) {
        int count;
        List<Integer> rareNotes = new ArrayList<>();
        for (int noteComparable : notes) {
            count = 0;
            System.out.println(noteComparable);
            for (int note : notes) {
                if (noteComparable == note) {
                    count++;
                }
            }
            if (count <= 1) {
                rareNotes.add(noteComparable);
            }
        }
        return createArray(rareNotes);
    }

    private static int[] createArray(List<Integer> rareNotes) {
        int[] rareNotesArray = new int[rareNotes.size()];

        for (int i = 0; i < rareNotes.size(); i++) {
            rareNotesArray[i] = rareNotes.get(i);
        }
        return rareNotesArray;
    }
}
